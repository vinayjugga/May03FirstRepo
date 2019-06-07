package com.vinay.synechron.OverLoading;

public class Addition {

	public void add(int a)
	{
		int c =a +10 ;
		System.out.println("Value of c:add(int a)"+c);
	}
	public static int add(int a, int b)
	{
		int d =a + b ;
		return d ;

	}
	public double add(double c)
	{
		double d = c+ 20.1 ;
		return d;
	}

	public static void main(String[] args) {

		Addition sum = new Addition();
		sum.add(10);	

		int doub =add(10,20);
		System.out.println("Value of int d:add(10,20):=" + doub);


		double d1 =sum.add(10.1);
		System.out.println("Value fo add(10.1) ="+d1);

	}
	public static void main(String[] args,String a) {
		
	}
	
	
	


}
