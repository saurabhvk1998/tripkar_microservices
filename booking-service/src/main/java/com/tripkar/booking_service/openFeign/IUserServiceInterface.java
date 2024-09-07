package com.tripkar.booking_service.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("registration-service")
public interface IUserServiceInterface {
	
	@GetMapping("/users/id")
	public ResponseEntity<?> getUserDetails(@RequestParam long id);
	
	@GetMapping("/users/dummy")
	public ResponseEntity<String> dummy();
}
