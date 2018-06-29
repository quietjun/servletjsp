package com.andy.ch07.service;

import java.util.ArrayList;

import com.andy.entity.Product;

public class ProductService {
	private static ProductService instance = new ProductService();

	private ProductService() {
	}

	public static ProductService getInstance() {
		return instance;
	}
	
	ArrayList<Product> productList = new ArrayList<Product>();
	
	public void addProduct(Product p){
		productList.add(p);
	}
	
	public ArrayList<Product> getAllProducts(){
		return productList;
	}
}
