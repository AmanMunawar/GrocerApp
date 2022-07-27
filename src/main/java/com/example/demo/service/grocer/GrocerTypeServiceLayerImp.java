package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryType;
import com.example.demo.repository.GroceryTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrocerTypeServiceLayerImp implements GrocerTypeServiceLayer {

    @Autowired
    private GroceryTypeDao groceryTypeDao;

    @Override
    public void addNewType(GroceryType groceryType) {

        groceryTypeDao.save(groceryType);
    }

    @Override
    public GroceryType getTyeByID(Integer id) {
        return this.groceryTypeDao.findById(id).get();
    }

    @Override
    public List<GroceryType> getAllTypes() {
        return this.groceryTypeDao.findAll();
    }

    @Override
    public void deleteTypeByID(Integer id) {
        this.groceryTypeDao.deleteById(id);
    }
}
