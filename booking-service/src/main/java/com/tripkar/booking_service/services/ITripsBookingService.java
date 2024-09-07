package com.tripkar.booking_service.services;

import java.util.List;

import com.tripkar.booking_service.pojos.TripsBooking;

public interface ITripsBookingService {
	List<TripsBooking> getAllBooking();
	TripsBooking addBooking(TripsBooking booking);
	String deleteBooking(long id);
}
