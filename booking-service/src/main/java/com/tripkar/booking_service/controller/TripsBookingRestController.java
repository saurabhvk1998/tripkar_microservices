package com.tripkar.booking_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripkar.booking_service.dto.ResponseDTO;
import com.tripkar.booking_service.dto.TripsBookingDetails;
import com.tripkar.booking_service.dto.Users;
import com.tripkar.booking_service.openFeign.IUserServiceInterface;
import com.tripkar.booking_service.pojos.TripsBooking;
import com.tripkar.booking_service.services.ITripsBookingService;


@RestController
@RequestMapping("/booking")
@CrossOrigin

public class TripsBookingRestController {
	//dependency : service layer i/f
	
	@Autowired
	ITripsBookingService bookingService;
	
	@Autowired
	IUserServiceInterface iUserServiceInterface;
	
//	@Autowired
//	IDestinationServiceInterface iDestinationServiceInterface;

	public TripsBookingRestController()
	{
		System.out.println("in ctor "+getClass().getName());
	}
	
	//add REST API endpoint : for getting all usersBooking
	
	@GetMapping
	public List<TripsBooking> fetchAllUserBooking()
	{
		System.out.println("in fetch all users destination booking");
		return bookingService.getAllBooking();
	}
	
	
	@PostMapping
	public ResponseEntity<?> addNewTripsBooking(@RequestBody TripsBooking booking)
	{
		System.out.println("in add user booking "+booking);
		try {
			
			System.out.println(booking.getUserId());
			int userId =booking.getUserId();
			//ResponseEntity<?> userDetails = iUserServiceInterface.getUserDetails(booking.getUserId());//booking.getUserId()
			ResponseEntity<String> userDetails=iUserServiceInterface.dummy();
//			if(userDetails.getStatusCode()== HttpStatus.OK)
//			{
//				Users user=(Users) userDetails.getBody();
//			}
			TripsBooking tBook = bookingService.addBooking(booking);
			TripsBookingDetails tripsBookingDetails=new TripsBookingDetails();
			tripsBookingDetails.setBillAmount(tBook.getBillAmount());
			tripsBookingDetails.setCheckInDate(tBook.getCheckInDate());
			tripsBookingDetails.setCheckOutDate(tBook.getCheckOutDate());
			tripsBookingDetails.setNumOfGuests(tBook.getNumOfGuests());
			//tripsBookingDetails.setHeading();
		return ResponseEntity.status(HttpStatus.CREATED).body(tripsBookingDetails);
		}catch(RuntimeException e) {
			System.out.println("err in add "+e);
//			return new ResponseEntity<>( new ErrorResponse("Adding user destination booking failed!!!!!",e.getMessage() ),
//					HttpStatus.INTERNAL_SERVER_ERROR);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<ResponseDTO> deleteTripsBooking(@PathVariable int id)
	{
		System.out.println("in delete user booking  details " +id);
		return ResponseEntity.ok(new ResponseDTO( bookingService.deleteBooking(id)));
	}
}