package com.tripkar.booking_service.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletResponse;

@FeignClient("destination-service")
public interface IDestinationServiceInterface {

	@GetMapping(value="/trips/{id}")
 	public ResponseEntity<?> getTripsDetails(@PathVariable long id,HttpServletResponse response);
	

}
