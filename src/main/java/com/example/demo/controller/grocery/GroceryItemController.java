package com.example.demo.controller.grocery;

import com.example.demo.grocer.model.grocer.GroceryItem;
import com.example.demo.grocer.model.grocer.GroceryType;
import com.example.demo.service.grocer.GrocerItemServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GroceryItemController {
    @Autowired
    private GrocerItemServiceLayer grocerItemServiceLayer;

    @PostMapping("/addnewItem")
    public void addNewItem(@RequestBody GroceryItem groceryItem) {
        grocerItemServiceLayer.addNewItem(groceryItem);
    }

    @GetMapping("/getAllItems")
    public ResponseEntity<List<GroceryItem>> getAllItems() {

        List<GroceryItem> groceryItems = new ArrayList<>();

        try {

            groceryItems = this.grocerItemServiceLayer.getAllItems();
            return ResponseEntity.status(HttpStatus.OK).body(groceryItems);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/getItem/{ItemId}")
    public ResponseEntity getItemByID(@PathVariable String ItemId) {

        GroceryItem groceryItem;

        try {
            groceryItem = this.grocerItemServiceLayer.getItemByID(Integer.parseInt(ItemId));
            return ResponseEntity.status(HttpStatus.OK).body(groceryItem);
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No Item with this Id Exist");
    }

    @DeleteMapping("/deleteItem/{ItemId}")
    public ResponseEntity deleteItemByID(@PathVariable String ItemID) {

        try {
            this.grocerItemServiceLayer.deleteItemByID(Integer.parseInt(ItemID));
            return ResponseEntity.status(HttpStatus.OK).body("Successfully Deleted ITem");
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not delete Item");
    }

    @GetMapping("/getItemsByType/{groceryTypeID}")
    public ResponseEntity getAllItemsByGrocerType(@PathVariable String groceryTypeID) {
        List<GroceryItem> groceryItems;
        try {
            groceryItems = this.grocerItemServiceLayer.getAllItemsByGrocerType(Integer.parseInt(groceryTypeID));
            return ResponseEntity.status(HttpStatus.OK).body(groceryItems);
        } catch (Exception e) {
            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

}
