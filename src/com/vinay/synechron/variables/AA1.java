package com.vinay.synechron.variables;
/* Write a program declare method and print local variable */
public class AA1 {
	
	public void printVariable()
	{
		/*primitive data types */
		
		int a =10 ; 
		float b = 20.0f ;
		char c ='A' ;
		double d = 33.33 ;
		
		System.out.println("Value of Integer:="+ a);
		System.out.println("Value of Float:="+ b);
		System.out.println("Value of char :="+ c);
		System.out.println("Value of Double:="+ d);	
	}

	public static void main(String[] args) {
		
		AA1 a = new AA1() ;
		a.printVariable();
				
	}

}
