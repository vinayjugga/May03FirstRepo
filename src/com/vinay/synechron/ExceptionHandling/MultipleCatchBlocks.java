package com.vinay.synechron.ExceptionHandling;

public class MultipleCatchBlocks {

	public static void main(String args[]){
		
		try{
			int a[]=new int[7];
			a[3]=30/4;
			System.out.println("First print statement in try block");
		}
		catch(ArithmeticException e){
			System.out.println("Warning: ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Warning: ArrayIndexOutOfBoundsException");
		}
		catch(Exception e){
			System.out.println("Warning: Some Other exception");
		}
		System.out.println("Out of try-catch block...");
		
	}

}
