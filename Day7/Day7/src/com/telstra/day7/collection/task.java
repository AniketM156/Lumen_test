package com.telstra.day7.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class task {
//	task:- ---> two list:- batch1 [rohit,john,ankit,sourab,rahul] 
//	batch2 [anil, manas, rohit, rahul, karan] make it into one batch ,
//	remove duplicate and sort the data in the ascending order.
//	int batch1 = {rohit,john,ankit,sourab,rahul};
//	int batch2 = {anil, manas, rohit, rahul, karan};
	
	public static void main () {
		ArrayList<String> batch1 = new ArrayList<String>();
		batch1.add("rohit");
		batch1.add("john");
		batch1.add("sourab");
		batch1.add("rahul");
		ArrayList<String>batch2=new ArrayList<String>();
		batch2.add("anil");
		batch2.add("manas");
		batch2.add("rohit");
		batch2.add("rahul");
		batch2.add("karan");
	}
	
	ArrayList<String>final_sol=new ArrayList<String>();
	LinkedHashSet<String> sol= new LinkedHashSet<String>();
	sol.addAll(batch1); 
	sol.addAll(batch2); 
	final_sol.addAll(sol);

	Collections.sort(final_sol); for(String answer:final_sol) { System.out.println(answer); }
	
}
