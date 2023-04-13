package com.example.demo.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categories")
public class ProductCatalog {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	
	private Long Id;
	@Column(name="name")
	private String name;

	public ProductCatalog() {
		
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public ProductCatalog(Long id, String name) {
		super();
		Id = id;
		this.name = name;
	}


}
