package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.repository.GrocerStoreInformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import com.example.demo.helper.AddressSubDetails;
import com.example.demo.helper.OpenMapStreetHelper;

@Service
public class GrocerStoreInformationImp implements GrocerStoreInformationService {

    @Autowired
    private OpenMapStreetHelper openMapStreetHelper;

    @Autowired
    private GrocerStoreInformationDao grocerStoreInformationDao;

    @Override
    public void addGrocerStoreInformation(GrocerStoreInformation grocerStoreInformation) {

        try {

            if (grocerStoreInformation != null) {

                AddressSubDetails addressSubDetails = openMapStreetHelper.getLatLongPositions(grocerStoreInformation);
                System.out.println(addressSubDetails);
                if (addressSubDetails != null) {

//                    System.out.print(addressSubDetails.getLat());
//                    System.out.print(addressSubDetails.getLon());

                    grocerStoreInformation.setLat(Float.toString(addressSubDetails.getLat()));
                    grocerStoreInformation.setLon(Float.toString(addressSubDetails.getLon()));
                    grocerStoreInformationDao.save(grocerStoreInformation);

                }
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
