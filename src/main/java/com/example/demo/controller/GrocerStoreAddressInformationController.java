package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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


//	@GetMapping("/addgroceraddressinformation")
//	public List<GrocerStoreInformation> addGrocerStoreInformation() {
//		return grocerStoreInformationService.getAllGrocerStoreInformation();
//	}

//	Getting a single GrocerStore

    @GetMapping("/getGrocerStoreInformation/{grocerStoreID}")
    public GrocerStoreInformation getGrocerStoreInformation(@PathVariable String grocerStoreID) {
//		I will add
//		I also have to add this function in service layer and DAO layer
        print("hello world");
        return null;
    }


    @PostMapping("/addGrocerStoreInformation")
    public ResponseEntity addGrocerStoreInformation(@RequestBody GrocerStoreInformation grocerStoreInformation) {

        try {
            grocerStoreInformationService.addGrocerStoreInformation(grocerStoreInformation);
            return ResponseEntity.status(HttpStatus.OK).body("SuccessFully Added");
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not Save Grocer Store Information");
    }


}

















