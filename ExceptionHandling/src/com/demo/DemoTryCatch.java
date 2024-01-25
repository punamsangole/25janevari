package com.demo;

public class DemoTryCatch {
	
	public static void main(String[] args) {
		try {
			int x = 10/0;
			/*String str = null;
			System.out.println(str.length());*/
			
		}catch (ArithmeticException ae){
		      System.out.println("ArithmeticException");
		 }
		
		catch (Exception e){
			 System.out.println("Exception");
		}
	}

}
