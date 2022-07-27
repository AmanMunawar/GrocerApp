package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryItem;
import com.example.demo.grocer.model.grocer.GroceryType;
import com.example.demo.repository.GrocerItemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrocerItemServiceLayerImpl implements GrocerItemServiceLayer {
    @Autowired
    private GrocerItemDao grocerItemDao;

    @Override
    public void addNewItem(GroceryItem groceryItem) {
        grocerItemDao.save(groceryItem);
    }

    @Override
    public GroceryItem getItemByID(Integer id) {
        return this.grocerItemDao.findById(id).get();
    }

    @Override
    public List<GroceryItem> getAllItems() {
        return this.grocerItemDao.findAll();
    }

    @Override
    public void deleteItemByID(Integer id) {
        this.grocerItemDao.deleteById(id);
    }

    @Override
    public List<GroceryItem> getAllItemsByGrocerType(Integer groceryTypeID) {
        return this.grocerItemDao.findAllByGroceryType(groceryTypeID);
    }
}
