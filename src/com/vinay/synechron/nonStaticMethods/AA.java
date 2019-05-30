package com.vinay.synechron.nonStaticMethods;



/* write the program to access the static variable inside the non-static block */
public class AA {
	
	static int a =10 ;
	static int vinayID =200 ;
	
	void testmethod1()
	{
		System.out.println("Static Varible direct access in non-static test1method :"+vinayID);
	}
	
	public void testNonStatcMethod()
	{
		System.out.println("Value of vinayID :"+a);
	}
	
	

	public static void main(String[] args) {
		
		AA a = new AA() ;
		a.testmethod1();
			
		a.testNonStatcMethod();
		System.out.println("Static variable value:="+vinayID);
		
	

	}

}
