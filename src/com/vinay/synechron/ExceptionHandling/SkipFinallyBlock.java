package com.vinay.synechron.ExceptionHandling;

public class SkipFinallyBlock {

	public static void main(String[] args) {
		
		try {
			   //try block
			   System.out.println("Inside try block");
			   System.exit(0);
			}
			catch (Exception exp) {
			   System.out.println(exp);
			}
			finally {
			   System.out.println("Java finally block");
			}
		System.out.println("outside try block");
	}

}
