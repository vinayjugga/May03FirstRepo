package com.vinay.synechron.variables;

/* write the program to access the static variable inside the static method and static block*/

public class CC {
	
	
	static int vinayID =100 ;
	static int b = 200 ;
	
	
	static void testmethod1()
	{
		System.out.println("Static variable access in the Static method or Block "+ vinayID);
	}
	
	static void test2()
	{
		System.out.println("Value of b");
	}

	public static void main(String[] args) {

		testmethod1();
		System.out.println("Value of ID:="+vinayID);
		

	}

}
