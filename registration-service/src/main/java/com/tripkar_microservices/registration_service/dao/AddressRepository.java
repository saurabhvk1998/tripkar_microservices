package com.tripkar_microservices.registration_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripkar_microservices.registration_service.pojos.Address;



public interface AddressRepository extends JpaRepository<Address, Long> {

}
