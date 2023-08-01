package com.telstra.app;

import com.telstra.model.Employee;

public class LombokDemo {
	public static void main(String[] args) {
		Employee employee = new Employee(1,"Aniket","associate software engineer");
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("mahadik");
		employee2.SetDept("developer");
		
//		System.out.println(employee.getId());
		
	}
}
