package com.telstra.day6.collection;

import java.util.ArrayList;

public class GenericCollection {

public static void main(String[] args) {

ArrayList<Integer> nums = new ArrayList<Integer>();

nums.add(1);

nums.add (2);

//nums.add("manish");

ArrayList<String> fruits = new ArrayList<String>();

fruits.add("apple");

fruits.add("banana");

fruits.add("mango");

ArrayList<Product> products = new ArrayList<Product>();
products.add(new Product(1, "laptop", 68000, electronics"));

}

}