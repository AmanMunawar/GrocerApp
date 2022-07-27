package com.example.demo.grocer.model.grocerinformation;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class GrocerStoreAddress {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String streetNumber;
    private String shopNo;
    private String country;
    private String county;
    private String city;
    private String EirCode;
    private String lat;
    private String lon;

}
