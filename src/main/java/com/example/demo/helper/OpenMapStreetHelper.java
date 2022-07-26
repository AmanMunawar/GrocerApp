package com.example.demo.helper;

import org.springframework.stereotype.Component;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;

import java.net.HttpURLConnection;
import java.net.URL;

import java.io.InputStreamReader;
import java.io.BufferedReader;

@Component
public class OpenMapStreetHelper {

	public AddressSubDetails getLatLongPositions(GrocerStoreInformation grocerStoreInformation) throws Exception {
		int responseCode = 0;

		String address = grocerStoreInformation.getShopNo() + "+" + grocerStoreInformation.getStreetNumber() + "+"
				+ grocerStoreInformation.getGrocerStoreName() 
				+ "+" + grocerStoreInformation.getCounty();



		String api = "https://nominatim.openstreetmap.org/search?q=" + address
				+ "&format=json&polygon=1&addressdetails=1";
		
		
		URL url = new URL(api);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.connect();
		responseCode = httpConnection.getResponseCode();

		if (responseCode == 200) {

			InputStream stream = httpConnection.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			StringBuilder result = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				result.append(line);
			}

			ObjectMapper objectMapper = new ObjectMapper();
			AddressSubDetails[] addressSubDetails = objectMapper.readValue(result.toString(),
					AddressSubDetails[].class);
			
			if (addressSubDetails.length > 0) {
				return addressSubDetails[0];
			}

		}
		return null;

	}
}
