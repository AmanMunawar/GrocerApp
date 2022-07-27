package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryCategory;

import java.util.List;

public interface GrocerCategoryServiceLayer {

    void addNewCategory(GroceryCategory groceryCategory);

    GroceryCategory getCategoryByID(Integer id);

    List<GroceryCategory> getAllCategories();

    void deleteCategoryByID(Integer id);
}
