package com.telstra.day7.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo {
	
	public static void main(String[] args) {

		HashSet<String> fruits = new HashSet<>();
		fruits.add("mango");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		
		System.out.println("hashset :" + fruits);
		
		LinkedHashSet<String> fruits2 = new LinkedHashSet<>();
		fruits2.add("mango");
		fruits2.add("mango");
		fruits2.add("apple");
		fruits2.add("apple");
		fruits2.add("banana");
		fruits2.add("banana");
		
		System.out.println("Linkedhashset :" + fruits2);
		
		
	}
}
