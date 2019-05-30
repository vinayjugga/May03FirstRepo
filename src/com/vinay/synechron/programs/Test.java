package com.vinay.synechron.programs;

public class Test {

	public Test()
	{
		System.out.println("test method");
	}
	
	public void test() 
	{
		System.out.println("Another method");
	}
	public static void main(String[] args) {
		
		Test t1 = new Test() ;
		t1.test();	

	}

}
