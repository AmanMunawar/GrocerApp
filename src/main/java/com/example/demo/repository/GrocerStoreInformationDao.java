package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;

public interface GrocerStoreInformationDao extends JpaRepository<GrocerStoreInformation, Integer>{

}
