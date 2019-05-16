package com.vinay.syenchron.staticmethods;

/* How can we access the static method without using class reference */

public class AA1 {

	static void test1()
	{
		System.out.println("AA1 class test1() method");
	}
	
	static void test2() 
	{
		System.out.println("AA1 class test2() method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("static method can be accessed in the static block "
				+ "direclty without classs reference also witin the class only ");
		test1();

	}

}
