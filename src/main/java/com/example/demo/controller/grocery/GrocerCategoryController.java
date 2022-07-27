package com.example.demo.controller.grocery;

import com.example.demo.grocer.model.grocer.GroceryCategory;
import com.example.demo.service.grocer.GrocerCategoryServiceLayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GrocerCategoryController {

    @Autowired
    private GrocerCategoryServiceLayer grocerCategoryServiceLayer;

    @PostMapping("/addnewcategory")
    public void addNewCategory(@RequestBody GroceryCategory groceryCategory) {
        grocerCategoryServiceLayer.addNewCategory(groceryCategory);
    }

    @GetMapping("/getAllCategories")
    public ResponseEntity<List<GroceryCategory>> getAllCategories() {

        List<GroceryCategory> groceryCategories = new ArrayList<>();

        try {

            groceryCategories = this.grocerCategoryServiceLayer.getAllCategories();
            return ResponseEntity.status(HttpStatus.OK).body(groceryCategories);
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/getCategory/{categoryID}")
    public ResponseEntity getCategoryByID(@PathVariable String categoryID) {

        GroceryCategory groceryCategory;

        try {
            groceryCategory = this.grocerCategoryServiceLayer.getCategoryByID(Integer.parseInt(categoryID));
            return ResponseEntity.status(HttpStatus.OK).body(groceryCategory);
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("No Category with this Id Exist");
    }

    @DeleteMapping("/deleteCategory/{categoryID}")
    public ResponseEntity deleteCategoryByID(@PathVariable String categoryID){

        try {
            this.grocerCategoryServiceLayer.deleteCategoryByID(Integer.parseInt(categoryID));
            return ResponseEntity.status(HttpStatus.OK).body("Successfully Deleted Category");
        } catch (Exception e) {

            System.out.println(e);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Could not delete Category");
    }

    //I will add the edit category later
//    @PutMapping("/updateCategory")

}
