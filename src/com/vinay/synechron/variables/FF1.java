package com.vinay.synechron.variables;

/* write the program to access the non-static variable */
public class FF1 {

	int a =10 ;
	int b= 20 ;
	static int c = 30 ;
	
	void testmethod()
	{
		System.out.println("Non- static method access b: ="+b +" b := "+c + " b+c:= "+(b +c));
	}
	
	public static void main(String[] args) {

		FF1 fobj =new FF1() ;
		fobj.testmethod();
		System.out.println("value of a:="+fobj.b);
		fobj.b =30 ;		
		
		FF1 fobj1 =new FF1() ;
		fobj1.testmethod();
		fobj1.b =50 ;
		
		System.out.println("value of a:="+fobj1.b);
		System.out.println("value of a:="+fobj.b);
		fobj1.testmethod();			

	}

}
