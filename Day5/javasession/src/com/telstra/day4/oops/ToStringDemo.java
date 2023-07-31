package com.telstra.day4.oops;

class Employee
{
	int id;
	String name;
	String dept;
	public Employee(int id,String name,String dept){
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		}
	
}
public class ToStringDemo()
{
	public static void main(String[] args) {
		int salary = 45000;
		Employee employee  = new Employee(1001,"Aniket","engineer");
		System.out.println(salary);
		System.out.println(employee);
	}

}


	