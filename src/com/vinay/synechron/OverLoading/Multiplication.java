package com.vinay.synechron.OverLoading;

/* write a program of multiplication of numbers using method overloading */
public class Multiplication {

	static void multiply(int a , int b)
	{
		int mul = a * b ;
		System.out.println("Multilication of 2 numbers "+a +"*"+b +":="+mul);
	}
	
	static int multiply(int c, int d, int e)
	{
		int totalmul = c * d * e ;
		System.out.println("Multiplication of 3 numbers:"+totalmul);
		return totalmul ;
	}
	
	public static void main(String args[])
	{
		System.out.println("Example of Mulitplication method using Method overloding ");
		multiply(20, 30);
		int result = multiply(30, 20, 10) ;
		System.out.println("Results of 3 numbers:="+result);
		
	}

}
