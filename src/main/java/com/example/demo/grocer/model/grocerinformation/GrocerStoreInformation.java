package com.example.demo.grocer.model.grocerinformation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="grocerstoreinformation")
public class GrocerStoreInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String grocerStoreName;
	private String grocerStoreEircode;
	
	
	//These information must be another objects class
	
	private String streetNumber;
	private String shopNo;
	private String country;
	private String county;
	private String city;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGrocerStoreName() {
		return grocerStoreName;
	}
	public void setGrocerStoreName(String grocerStoreName) {
		this.grocerStoreName = grocerStoreName;
	}
	public String getGrocerStoreEircode() {
		return grocerStoreEircode;
	}
	public void setGrocerStoreEircode(String grocerStoreEircode) {
		this.grocerStoreEircode = grocerStoreEircode;
	}
	public String getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getShopNo() {
		return shopNo;
	}
	public void setShopNo(String shopNo) {
		this.shopNo = shopNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

//	private GrocerStoreAddress grocerStoreAddress;
	

}
