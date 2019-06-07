package com.vinay.synechron.ExceptionHandling;

public class ExceptionNotHandled {

	public static void main(String args[]){
		try{
			System.out.println("First statement of try block");
			int num=45/0;
			System.out.println(num);
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException:=");
			//e.printStackTrace();
		}
		finally{
			System.out.println("finally block");
		}
		System.out.println("Out of try-catch-finally block");
		
		
	
	try {
		
		final int num=45/0;
		
	}
	catch(ArithmeticException e)
	{
		//System.exit(0);
	}
	finally
	{
		System.out.println("Exception finally");
	}
	

}
}
