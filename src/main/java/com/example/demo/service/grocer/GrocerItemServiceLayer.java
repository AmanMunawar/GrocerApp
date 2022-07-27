package com.example.demo.service.grocer;

import com.example.demo.grocer.model.grocer.GroceryItem;
import com.example.demo.grocer.model.grocer.GroceryType;

import java.util.List;

public interface GrocerItemServiceLayer {

    void addNewItem(GroceryItem groceryItem);

    GroceryItem getItemByID(Integer id);

    List<GroceryItem> getAllItems();

    void deleteItemByID(Integer id);

    List<GroceryItem> getAllItemsByGrocerType(Integer groceryTypeID);
}
