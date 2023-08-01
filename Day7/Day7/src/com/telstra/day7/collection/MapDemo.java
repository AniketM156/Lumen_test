package com.telstra.day7.collection;

import java.util.HashMap;
//import java.util.LinkedHashSet;
//import java.util.HashSet;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("sachin","batsman");
		hm.put("dhoni","wicketkeeper");
		hm.put("bumraw","bawler");
		hm.put("virat","batsman");
		
		System.out.println("hashmap :" + hm);
		System.out.println("hashmap values :" + hm.values());
		System.out.println("hashmap keys:" + hm.keySet());
		
//		for(String key : ) {
//			
//		}
	}
}
