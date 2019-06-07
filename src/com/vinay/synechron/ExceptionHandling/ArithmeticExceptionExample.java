package com.vinay.synechron.ExceptionHandling;

import java.io.IOException;

public class ArithmeticExceptionExample {

	public static void main(String[] args) throws Exception {		

		int num1, num2;
		try {			
			num1 = 0;
			num2 = 62 / num1;
			System.out.println(num2);
			System.out.println("Hey I'm at the end of try block");
		}
		catch (ArrayIndexOutOfBoundsException e) { 			
			System.out.println("You should not divide a number by zero");
		}
		catch (Exception e) {		
			throw new Exception();
			//System.out.println("Exception occurred");
		}
		System.out.println("I'm out of try-catch block in Java.");

	}
}
