package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryCategory;
import com.example.demo.repository.GrocerCategoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrocerCategoryServiceLayerImp implements GrocerCategoryServiceLayer {

    @Autowired
    private GrocerCategoryDao grocerCategoryDao;

    @Override
    public void addNewCategory(GroceryCategory groceryCategory) {

        this.grocerCategoryDao.save(groceryCategory);
    }

    @Override
    public GroceryCategory getCategoryByID(Integer id) {

        return this.grocerCategoryDao.findById(id).get();
    }

    @Override
    public List<GroceryCategory> getAllCategories() {
        return this.grocerCategoryDao.findAll();
    }

    @Override
    public void deleteCategoryByID(Integer id) {
        this.grocerCategoryDao.deleteById(id);
    }

}
