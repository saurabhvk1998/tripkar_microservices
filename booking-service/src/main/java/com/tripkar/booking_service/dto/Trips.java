package com.tripkar.booking_service.dto;

import com.tripkar.booking_service.pojos.BaseEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString

public class Trips extends BaseEntity{
	
	
	private String heading;
	private String description;
	
	private int price;
	
}
