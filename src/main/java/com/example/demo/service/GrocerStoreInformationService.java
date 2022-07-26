package com.example.demo.service;

import java.util.List;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;


public interface GrocerStoreInformationService {
	
	public void addGrocerStoreInformation(GrocerStoreInformation grocerStoreInformation);
	public List<GrocerStoreInformation> getAllGrocerStoreInformation();

}
