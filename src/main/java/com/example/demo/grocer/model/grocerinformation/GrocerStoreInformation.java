package com.example.demo.grocer.model.grocerinformation;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
//@Table(name = "grocerstoreinformation")
public class GrocerStoreInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String grocerStoreName;
    private String fullAddress;
    private String country;
    private String county;
    private String city;
    private String eirCode;
    private String lat;
    private String lon;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGrocerStoreName() {
        return grocerStoreName;
    }

    public void setGrocerStoreName(String grocerStoreName) {
        this.grocerStoreName = grocerStoreName;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
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

    public String getEirCode() {
        return eirCode;
    }

    public void setEirCode(String eirCode) {
        this.eirCode = eirCode;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
