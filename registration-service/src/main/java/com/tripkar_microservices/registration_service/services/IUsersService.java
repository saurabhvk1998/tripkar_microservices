package com.tripkar_microservices.registration_service.services;

import java.util.List;

import com.tripkar_microservices.registration_service.dto.ValidateUser;
import com.tripkar_microservices.registration_service.pojos.Users;



public interface IUsersService {
	List<Users> getAllUsers();
	Users addUser(Users user);
	String deleteUser(long userId);
	Users getDetails(long userId);
	Users updateDetails(Users detachedUSer);
	Users validateUser(ValidateUser user);
}
