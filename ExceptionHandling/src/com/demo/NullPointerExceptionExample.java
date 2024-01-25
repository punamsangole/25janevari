package com.demo;

public class NullPointerExceptionExample {
	
	public static void main(String[] args) {
		String str = null;
		try {
		  System.out.println(str.length());
		}catch(NullPointerException ne){
			System.out.println("ne this");
		}
		
		
	}

}
