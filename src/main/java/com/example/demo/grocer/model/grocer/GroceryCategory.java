package com.example.demo.grocer.model.grocer;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class GroceryCategory {
	
	
	@Id
	@GeneratedValue ( strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nameOfCategory;

	@OneToMany (mappedBy = "groceryCategory")
	@JsonBackReference
	private List<GroceryType> groceryTypes;

	//some properties would come latter 


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameOfCategory() {
		return nameOfCategory;
	}

	public void setNameOfCategory(String nameOfCategory) {
		this.nameOfCategory = nameOfCategory;
	}

	public List<GroceryType> getGroceryTypes() {
		return groceryTypes;
	}

	public void setGroceryTypes(List<GroceryType> groceryTypes) {
		this.groceryTypes = groceryTypes;
	}
}
