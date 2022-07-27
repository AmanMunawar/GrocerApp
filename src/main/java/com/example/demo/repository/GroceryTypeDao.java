package com.example.demo.repository;

import com.example.demo.grocer.model.grocer.GroceryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryTypeDao extends JpaRepository<GroceryType, Integer> {
}
