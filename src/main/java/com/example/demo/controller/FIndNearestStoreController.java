package com.example.demo.controller;

// import com.example.demo.LanAndLon;
import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import com.example.demo.repository.GrocerStoreInformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FIndNearestStoreController {

    @Autowired
    private GrocerStoreInformationDao grocerStoreInrmationDao;

    // //later would come a
    // @GetMapping("/findnearestgrocerstore")
    // public ResponseEntity findNearestGrocerStore(@RequestBody LanAndLon lanAndLon) {


    //     List<GrocerStoreInformation> grocerStoreInfoList = grocerStoreInformationDao.findAll();

    //     GrocerStoreInformation grocerStoreInformation = findTheNearestStore(grocerStoreInfoList, lanAndLon);

    //     return ResponseEntity.status(HttpStatus.OK).body(grocerStoreInformation);
    // }

    // private GrocerStoreInformation findTheNearestStore(List<GrocerStoreInformation> grocerStoreInfoList,
    //                                                    LanAndLon customerLatAndLon) {

    //     Double customerLat = Double.parseDouble(customerLatAndLon.getLat());
    //     Double customerLon = Double.parseDouble(customerLatAndLon.getLon());
    //     GrocerStoreInformation grocerStoreInformationToReturn = new GrocerStoreInformation();

    //     double minimumDistance = 0.0;
    //     Boolean flag = false;

    //     for (GrocerStoreInformation grocerStoreInformation : grocerStoreInfoList) {

    //         double dist = org.apache.lucene.util.SloppyMath.haversinMeters(customerLat,
    //                 customerLon,
    //                 Double.parseDouble(grocerStoreInformation.getLat()),
    //                 Double.parseDouble(grocerStoreInformation.getLon()));

    //         if (!flag) {
    //             minimumDistance = dist;
    //             grocerStoreInformationToReturn = grocerStoreInformation;
    //             flag = true;
    //         } else if (minimumDistance > dist) {
    //             minimumDistance = dist;
    //             grocerStoreInformationToReturn = grocerStoreInformation;
    //         }
    //     }


    //     return grocerStoreInformationToReturn;
    // }
}
