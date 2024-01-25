package com.demo;

import java.util.Scanner;

public class ArithmeticExceptionExample {
	
	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divisor>>");
		int d=sc.nextInt();
		int x =10/d;
		
		System.out.println("x>>"+x);
		
	}

}
