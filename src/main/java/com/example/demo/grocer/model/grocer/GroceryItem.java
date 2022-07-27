package com.example.demo.grocer.model.grocer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class GroceryItem {
	

	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOfItem;
	@ManyToOne
	@JsonBackReference
	private GroceryType groceryType;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfItem() {
		return nameOfItem;
	}

	public void setNameOfItem(String nameOfItem) {
		this.nameOfItem = nameOfItem;
	}

	public GroceryType getGroceryType() {
		return groceryType;
	}

	public void setGroceryType(GroceryType groceryType) {
		this.groceryType = groceryType;
	}
}
