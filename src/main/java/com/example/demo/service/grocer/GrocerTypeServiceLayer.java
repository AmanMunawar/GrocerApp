package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryType;

import java.util.List;

public interface GrocerTypeServiceLayer {

    void addNewType(GroceryType groceryCategory);

    GroceryType getTyeByID(Integer id);

    List<GroceryType> getAllTypes();

    void deleteTypeByID(Integer id);
}
