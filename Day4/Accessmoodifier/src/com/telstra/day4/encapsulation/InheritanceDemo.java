package com.telstra.day4.encapsulation;

class Person
{
	public Person() {
		System.out.println("Person constructer");
	}
}

class Employee
{
	public Employee() {
		System.out.println("Employee constructer");
	}
}

public class InheritanceDemo{
	public static void main(String[] args) {
		Person person = new Person() ;
		System.out.println("---------------------------")
		Employee employee = new Employee();
	}
}