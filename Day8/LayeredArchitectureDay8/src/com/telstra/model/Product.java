package com.telstra.model;

public class Product {
	private int id;
	private String name;
	private String category;
	private int price;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id,String name,String category,int price) {
		super();
		this.name = name;
		this.category = category;
		this.price = price;
	}
	
}
