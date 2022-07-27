package com.example.demo.grocer.model.grocer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity

public class GroceryType {
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOfType;

	@ManyToOne
	@JsonBackReference
	private GroceryCategory groceryCategory;


	@OneToMany (mappedBy = "groceryType")
	private List<GroceryItem> groceryItems;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfType() {
		return nameOfType;
	}

	public void setNameOfType(String nameOfType) {
		this.nameOfType = nameOfType;
	}

	public GroceryCategory getGroceryCategory() {
		return groceryCategory;
	}

	public void setGroceryCategory(GroceryCategory groceryCategory) {
		this.groceryCategory = groceryCategory;
	}

	public List<GroceryItem> getGroceryItems() {
		return groceryItems;
	}

	public void setGroceryItems(List<GroceryItem> groceryItems) {
		this.groceryItems = groceryItems;
	}
}
