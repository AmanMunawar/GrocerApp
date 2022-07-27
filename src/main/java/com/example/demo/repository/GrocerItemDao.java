package com.example.demo.repository;

import com.example.demo.grocer.model.grocer.GroceryItem;
import com.example.demo.grocer.model.grocer.GroceryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrocerItemDao extends JpaRepository<GroceryItem, Integer> {

//    @Query( "select FROM GroceryItem as bk join bk.pages pg WHERE bk.bookId = :bookId")
    @Query(value = "Select * from grocery_item as gc where gc.grocery_type_id= ?1 ", nativeQuery = true)
    List<GroceryItem> findAllByGroceryType(Integer groceryTypeID);
}
