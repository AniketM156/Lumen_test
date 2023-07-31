package com.telstra.day5.polymorphisim;
import java.util.Scanner; 
public class sum { 

public static void main(String[] args) 
{ 
	Scanner scanner = new Scanner(System.in); 
	System.out.print("Enter a number :"); 
	int a = scanner.nextInt(); 
	System.out.print("How many times : "); 
	int b= scanner.nextInt(); 
	for(int i=1;i<=b;i++){ 
		System.out.println(a+" * "+i+" = "+ i*a); 
		} 
	}
}