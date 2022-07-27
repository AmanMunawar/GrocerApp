package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.grocer.model.grocerinformation.GrocerStoreInformation;
import org.springframework.stereotype.Repository;

@Repository
public interface GrocerStoreInformationDao extends JpaRepository<GrocerStoreInformation, Integer>{

}
