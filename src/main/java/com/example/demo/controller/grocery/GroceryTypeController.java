package com.example.demo.controller.grocery;

import com.example.demo.grocer.model.grocer.GroceryType;
import com.example.demo.service.grocer.GrocerTypeServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GroceryTypeController {

    @Autowired
    private GrocerTypeServiceLayer grocerTypeServiceLayer;

    @PostMapping("/addnewtype")
    public void addNewType(@RequestBody GroceryType groceryType) {

        grocerTypeServiceLayer.addNewType(groceryType);
    }

    @GetMapping("/getAllTypes")
    public ResponseEntity<List<GroceryType>> getAllCategories() {

        List<GroceryType> groceryTypes = new ArrayList<>();

        try {

            groceryTypes = this.grocerTypeServiceLayer.getAllTypes();
            return ResponseEntity.status(HttpStatus.OK).body(groceryTypes);
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/getType/{typeId}")
    public ResponseEntity getCategoryByID(@PathVariable String typeId) {

        GroceryType groceryType;

        try {
            groceryType = this.grocerTypeServiceLayer.getTyeByID(Integer.parseInt(typeId));
            return ResponseEntity.status(HttpStatus.OK).body(groceryType);
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No Type with this Id Exist");
    }

    @DeleteMapping("/deleteType/{typeId}")
    public ResponseEntity deleteTypeByID(@PathVariable String typeId) {

        try {
            this.grocerTypeServiceLayer.deleteTypeByID(Integer.parseInt(typeId));
            return ResponseEntity.status(HttpStatus.OK).body("Successfully Deleted Type");
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not delete Type");
    }
}
