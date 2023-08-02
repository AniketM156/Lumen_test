package com.telstra.service;

import java.util.ArrayList;

import com.telstra.model.Product;

public class ProductService {
	private ArrayList<Product> products = new ArrayList();
	
	public String addProduct(Product product);
	{
		products.add(Product);
		return "product sucessfully added";
	}
	
	public ArrayList<Product> getAllproduct()
	{
		return products;
	}
	
	public void getProductByCategory()
	{
		for(Product product :products) {
			if(product.getCategory().equalsIgnoreCase(category)) {
				System.out.println(product);
			}
		}
	}
}
