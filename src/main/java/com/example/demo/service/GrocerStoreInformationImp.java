package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import com.example.demo.helper.AddressSubDetails;
import com.example.demo.helper.OpenMapStreetHelper;

@Service
public class GrocerStoreInformationImp implements GrocerStoreInformationService {

	@Autowired
	private OpenMapStreetHelper openMapStreetHelper;

	@Override
	public void addGrocerStoreInformation(GrocerStoreInformation grocerStoreInformation) {

		try {
			AddressSubDetails addressSubDetails = openMapStreetHelper.getLatLongPositions(grocerStoreInformation);

			if (addressSubDetails != null) {

				System.out.print(addressSubDetails.getLat());
				System.out.print(addressSubDetails.getLon());
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List<GrocerStoreInformation> getAllGrocerStoreInformation() {
		return new ArrayList<GrocerStoreInformation>();

	}

}
