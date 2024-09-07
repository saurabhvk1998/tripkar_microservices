package com.tripkar.booking_service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tripkar.booking_service.dao.EnquiryRepository;
import com.tripkar.booking_service.pojos.Enquiry;
@Service
@Transactional
public class EnquiryServiceImpl implements IEnquiryService {

	@Autowired
	private EnquiryRepository enquiryRepo;
	
	
	@Override
	public List<Enquiry> getAllEnquiry() {
		
		return enquiryRepo.findAll();
	}


	@Override
	public Enquiry addEnquiry(Enquiry enquiry) {
		
		return enquiryRepo.save(enquiry);
	}


	@Override
	public String deleteEnquiry(long id) {
		enquiryRepo.deleteById(id);
		return "Enquiry details deleted for ID= "+id;
	}
	
	

}
