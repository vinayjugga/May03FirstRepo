package com.vinay.synechron.nonStaticMethods;

public class BB {
	
	public int a  = 20 ;
	public int vinayID = 400 ;
	
	public void test1()
	{
		System.out.println("Non- static method test1()"+a);
	}
	
	public void test2()
	{
		System.out.println("Access Global variable Direclty"+vinayID);
	}

	public static void main(String[] args) {
		
		BB b = new BB() ;
		b.test1();
		b.test2();
		

	}

}
