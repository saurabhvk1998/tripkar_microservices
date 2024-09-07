package com.tripkar.booking_service.services;

import java.util.List;

import com.tripkar.booking_service.pojos.Enquiry;

public interface IEnquiryService {
	List<Enquiry> getAllEnquiry();
	Enquiry addEnquiry(Enquiry enquiry);
	String deleteEnquiry(long id);
}
