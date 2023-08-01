package com.telstra.day6.exception;
import java.io.IOException;

class UserInValidAgeException extends RuntimeException 
{ 
	String msg; 
	public UserInValidAgeException(String msg) 
	{ 
		super(); 
		this.msg = msg; 
	} 
	public String getMsg() 
	{ 
		return msg; 
	} 
}

class Customer2 { 
	public void checkEligiblity(int age) 
	{ 
		if(age>=18) System.out.println("eligible to vote"); 
		else throw new UserInValidAgeException("age is less, minimum should be 18"); 
		} 
	}

public class UserDefinedException { 
	public static void main(String[] args) 
	{ 
		Customer2 customer2 = new Customer2(); 
		try 
		{ 
			customer2.checkEligiblity(23); 
		} 
		catch (UserInValidAgeException e) 
		{ 
			System.out.println(e.getMsg()); 
		}
	} 
}
