package com.telstra.day4.encapsulation;

class Parent {
	void mothertoungue() {
		System.out.println("this is parent");
		}
	}

class Child extends Parent {
	void mothertounge() {
		System.out.println("speak english");
		}
	}

public class singleInheritance {
	public static void main (String[] args) {
		Child child = new Child() ;
		child.mothertoungue();
			}
	
	}

