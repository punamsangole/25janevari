package com.throwdemo;

public class Demo {
	
	public static void main(String[] args) {
		try {
		    throw new ArithmeticException("ArithmeticException example");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
