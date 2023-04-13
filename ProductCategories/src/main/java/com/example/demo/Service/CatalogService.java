package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.ProductCatalog;

public interface CatalogService {
	List<ProductCatalog> getallCategories();
	ProductCatalog getCategoryById(long id);
	ProductCatalog getCategoryByname(String name);

}
