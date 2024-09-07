package com.tripkar.booking_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripkar.booking_service.pojos.TripsBooking;

public interface TripsBookingRepository extends JpaRepository<TripsBooking, Long>{

}
