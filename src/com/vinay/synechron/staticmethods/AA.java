package com.vinay.synechron.staticmethods;

/* write the program to access the static method without using the class reference */

public class AA { 
	
	static void testMethod1()
	{
		System.out.println("AA class Static method From Testmethod1()");
	}
	
	static void test2()
	{
		System.out.println("AA class Test2 method");
	}
	
	static void test3()
	{
		System.out.println("AA class test3 method ");
	}

	public static void main(String[] args) {
		
		System.out.println("Static method can be accesed with Class reference");
		AA.testMethod1();
		AA.test2(); 
		
	}

}
