package com.example.demo.repository;

import com.example.demo.grocer.model.grocer.GroceryCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrocerCategoryDao extends JpaRepository<GroceryCategory, Integer> {
}
