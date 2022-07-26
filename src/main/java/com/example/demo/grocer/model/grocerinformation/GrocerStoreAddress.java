package com.example.demo.grocer.model.grocerinformation;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GrocerStoreAddress {
	
	
	private int id;
	private String streetNumber;
	private String shopNo;
	private String country;
	private String county;
	private String city;

}
