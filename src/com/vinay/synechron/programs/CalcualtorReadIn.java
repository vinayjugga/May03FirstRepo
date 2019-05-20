package com.vinay.synechron.programs;

import java.util.Scanner;

public class CalcualtorReadIn {
	int a =20;
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
		
		Scanner input = new Scanner(System.in);
		System.out.println("*****************************");
		System.out.println("Enter two number for Calucaltion:=");
		int a =input.nextInt() ;
		int b =input.nextInt() ;
		CalcualtorReadIn calObj = new CalcualtorReadIn() ;
		calObj.sum(a, b);
		calObj.sub(a, b);
		calObj.mul(a, b);		

	}


}
