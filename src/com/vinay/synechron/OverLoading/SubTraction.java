package com.vinay.synechron.OverLoading;
/* what is the output of with the same method and same argument */

public class SubTraction {

	static void substraction(int a, int b)
	{
		int sub = a - b ;
		System.out.println("Subtraction a, b:="+ sub);
	}
	
	/*static void substraction(int c, int d)
	{
		int sub = c - d ;
		System.out.println("Subtraction c, d:="+sub);
	}*/
	public static void main(String[] args) {
		
		System.out.println("Method overloading Example of same method name and same Arguments");
		substraction(20,10) ;
		substraction(30,30) ;
		

	}

}
