package com.tripkar.booking_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripkar.booking_service.pojos.Enquiry;

public interface EnquiryRepository extends JpaRepository<Enquiry,Long> {

}
