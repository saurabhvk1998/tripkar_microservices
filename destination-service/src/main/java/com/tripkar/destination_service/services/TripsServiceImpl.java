package com.tripkar.destination_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tripkar.destination_service.custom_exception.UserHandlingException;
import com.tripkar.destination_service.dao.TripsRepository;
import com.tripkar.destination_service.pojos.Trips;




@Service
@Transactional
public class TripsServiceImpl implements ITripsService {
	

	
	@Autowired
	private TripsRepository destinationRepo;
	

	
	@Override
	public List<Trips> getAllTrips() {
		
		return destinationRepo.findAll();
	}
	
	@Override
	public Trips addTrips(Trips details) {
		
		return destinationRepo.save(details);
	}
	
	@Override
	public String deleteTrips(long id) {
		destinationRepo.deleteById(id);
		return "Trip details deleted for ID= "+id;
	}

	@Override
	public Trips getTripsDetails(long id) {
		
		return destinationRepo.findById(id).
				orElseThrow(()->new UserHandlingException("Invalid Trip ID"));
	}

//	@Override
//	public Destination updateDestinationDetails(Destination details) {
//		
//		return null;
//	}
	
	
	
}
