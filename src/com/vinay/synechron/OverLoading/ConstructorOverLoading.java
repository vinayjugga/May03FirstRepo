package com.vinay.synechron.OverLoading;

public class ConstructorOverLoading {
	
	static void ConstructorOverLoading()
	{
		System.out.println("No Argument in this testMethod() ");
	}
	
	static void ConstructorOverLoading(int a)
	{
		System.out.println("Method have the 1 arument testMethod(int a)");
	}
	
	static void ConstructorOverLoading(int a ,double d)
	{
		System.out.println("Method have the 2 arguments testMethod(int a double d");
	}
	
	static void ConstructorOverLoading(double c, int b)
	{
		System.out.println("method have the 2 argumeths testMEthod(double c, int b)");
	}
	public static void main(String[] args) {
		
		System.out.println("Example of Overlaoding method");
		int a = 10 ;
		
		ConstructorOverLoading();
		ConstructorOverLoading(10);
		ConstructorOverLoading(20.0, 30);
		ConstructorOverLoading(20, 40.3);
		//ConstructorOverLoading(10,10);
		
		
	}

}
