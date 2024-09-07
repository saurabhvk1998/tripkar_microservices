package com.tripkar.booking_service.pojos;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tripkar.booking_service.dto.Users;

import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class TripsBooking extends BaseEntity{
	
	
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String numOfGuests;
	private String isAvaliable;
	private int billAmount;
	//private String heading;
	private int userId;
	private int tripId;
	
//	@JsonIgnore
//	@Transient
//	Users user;
	
	
	
	
}
