package com.vinay.synechron.ExceptionHandling;

public class UnCheckedException {

public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		
		try{
			int a[] = new int[7] ;
			a[10] =30 /5 ;
			System.out.println("Frist try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catched ArtihmeticException");
			//e.printStackTrace();
		}		
		catch(Exception e)
		{
			System.out.println("Catched Other Exception if other than above");
			e.printStackTrace();
		}
		
		

	}
}
