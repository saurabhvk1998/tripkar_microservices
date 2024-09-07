package com.tripkar_microservices.registration_service.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tripkar_microservices.registration_service.pojos.Users;



public interface UsersRepository extends JpaRepository<Users, Long>{
	public Users findByemail(String email);
}
