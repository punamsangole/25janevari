package com.demo;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("first line");
		System.out.println("second line");
		System.out.println("third line");
		try {
			 System.out.println("before risky code");
			 
		     int x = 10/0;//exception 
		     System.out.println("Inside try block ");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("forth line");
		System.out.println("fifth line");

	}

}
