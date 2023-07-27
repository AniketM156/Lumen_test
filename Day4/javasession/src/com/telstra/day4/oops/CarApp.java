package com.telstra.day4.oops;


class Car
{
	int modelNo;
	String brandName;
	int kilometerDriven;
	
	String checkCarStatus()
	{
		if(kilometerDriven <= 5000)
			return "new car";
		else if(kilometerDriven>5000 && kilometerDriven<=20000)
			return "car is old";
	return "car is old";
	}
	void displayCarDetails()
	{
		System.out.println("modelno:"+ modelNo);
		System.out.println("brand : " + brandName);
	}
	


public static void main(String args[])
{
    System.out.println("Hello World");
    System.out.println("Hello World");
    
}
}