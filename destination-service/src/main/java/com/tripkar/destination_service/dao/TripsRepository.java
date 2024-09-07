package com.tripkar.destination_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripkar.destination_service.pojos.Trips;

public interface TripsRepository extends JpaRepository<Trips, Long> {

}
