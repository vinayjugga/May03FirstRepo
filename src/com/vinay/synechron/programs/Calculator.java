package com.vinay.synechron.programs;

public class Calculator {
	int a =10;
	int b =10;
	int c ;

	public void sum(int a, int b)
	{
		c= a+b ;
		System.out.println("Addtion of two numbers:=" +c);
		
	}
	public void sub(int a, int b)
	{
		c= a- b;
		System.out.println("Subtraction of two numbers:="+ c);
	}
	
	public void mul(int a, int b)
	{
		c = a* b ;
		System.out.println("Multiplication of two numbers:="+c);
	}
	
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.sum(calculator.a, calculator.b);
		calculator.sum(2, 2);
		
		calculator.sub(calculator.a, calculator.b);
		calculator.sub(2, 2);
		
		calculator.mul(calculator.a, calculator.b);
		calculator.mul(2, 2);

	}

}
