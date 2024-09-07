package com.tripkar.booking_service.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TripsBookingDetails {
	
	private String heading;
	private String userName;
	private LocalDate checkInDate;
	private LocalDate checkOutDate;
	private String numOfGuests;
	private int billAmount;

}
