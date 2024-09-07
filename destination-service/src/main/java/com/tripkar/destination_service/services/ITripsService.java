package com.tripkar.destination_service.services;

import java.util.List;

import com.tripkar.destination_service.pojos.Trips;



public interface ITripsService {
	List<Trips> getAllTrips();
	Trips addTrips(Trips details);
	String deleteTrips(long id);
	//Destination updateDestinationDetails(Destination details);
	Trips getTripsDetails(long id);
}
