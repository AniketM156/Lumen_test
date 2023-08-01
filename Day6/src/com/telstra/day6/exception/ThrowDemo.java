package com.telstra.day6.exception;

import java.io.IOException;

class User
{
	public static void CheckElegibility(int age)
	{
		if(age>=18)
		{
			System.out.println("vote");
		}
		else {
			throw new ArithmeticException("not allowed to vote");
		}
	}
	public static void CheckElegibility2(int age) throws IOException
	{
		if(age>=18)
		{
			System.out.println("vote");
		}
		else {
			throw new IOException("not allowed to vote");
		}
	}
	
	public class ThrowDemo{
		public static void main(String[] args) throws IOException
		{
			User user = new User();
			
			try {
				user.CheckElegibility(56);
				user.CheckElegibility2(3);
				
			}
			catch(Exception e){
				System.out.println("Something went wrong");
			}

		}
	}
}










