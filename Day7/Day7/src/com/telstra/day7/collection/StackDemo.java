package com.telstra.day7.collection;

import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> nums = new Stack<>();
		nums.add(1);
		nums.push(2);
		nums.push(3);
		
		System.out.println("elements : " + nums);
		
		nums.pop();
		System.out.println("elements : " + nums);
		nums.pop();
		System.out.println("elements : " + nums);
		
	}
}
