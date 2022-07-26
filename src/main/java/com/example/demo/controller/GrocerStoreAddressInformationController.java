package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import com.example.demo.service.GrocerStoreInformationService;



@RestController
public class GrocerStoreAddressInformationController {
	

	@Autowired
	private GrocerStoreInformationService grocerStoreInformationService;
	
	
	@GetMapping("/addgroceraddressinformation")
	public List<GrocerStoreInformation> addGrocerStoreInformation() {
		return grocerStoreInformationService.getAllGrocerStoreInformation();
	}
	
//	Getting a single GrocerStore

	@GetMapping("/getGrocerStoreInformation/{grocerStoreID}")
	public GrocerStoreInformation getGrocerStoreInformation(@PathVariable String grocerStoreID) {
//		I will add
//		I also have to add this function in service layer and DAO layer
		return null;
	}
	
	
	@PostMapping("/addGrocerStoreInformation")
	public GrocerStoreInformation addGrocerStoreInformation(@RequestBody GrocerStoreInformation grocerStoreInformation) {
//		
//		System.out.print(grocerStoreInformation.getCity());
		grocerStoreInformationService.addGrocerStoreInformation(grocerStoreInformation);
		return grocerStoreInformation;
	}
	
}

















