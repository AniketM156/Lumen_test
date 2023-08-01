package com.telstra.day6.exception;
import java.io.IOException;

class InValidAgeException extends RuntimeException 
{ 
	String msg; 
	public InValidAgeException(String msg) 
	{ 
		super(); 
		this.msg = msg; 
	} 
	public String getMsg() 
	{ 
		return msg; 
	} 
}

class Customer { 
	public void checkEligiblity(int age) 
	{ 
		if(age>=18) System.out.println("eligible to vote"); 
		else throw new InValidAgeException("age is less, minimum should be 18"); 
		} 
	}

public class UserDefinedException { 
	public static void main(String[] args) 
	{ 
		Customer customer = new Customer(); 
		try 
		{ 
			customer.checkEligiblity(23); 
		} 
		catch (InValidAgeException e) 
		{ 
			System.out.println(e.getMsg()); 
		}
	} 
}
