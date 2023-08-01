package com.telstra.day6.collection;

import java.util.ArrayList;

public class ArrayListDemo{
	public static void main(String[] args){
		ArrayList obj = new ArrayList();
		System.out.println("size of array list is : " + obj.size());
		
		obj.add(2);
		obj.add(3);
		obj.add("hello");
		System.out.println("size of array list is : " + obj.size());

	}
}