package com.vinay.synechron.ExceptionHandling;

public class FinallyTryBlock {

	public static void main(String args[])
	   {
	      System.out.println(FinallyTryBlock.myMethod());  
	   }
	
	   public static int myMethod()
	   {
	      try {
	    	  System.out.println("try block");
	    	  return 112;
	      }
	      finally {
	        System.out.println("This is Finally block");
	        System.out.println("Finally block ran even after return statement");
	      }
	   }
	   
	   

}
