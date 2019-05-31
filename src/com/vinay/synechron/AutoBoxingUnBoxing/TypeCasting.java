package com.vinay.synechron.AutoBoxingUnBoxing;


class IntegerCasting
{
	int a = 10 ;	
	int a1 =(int)20.4 ;	
	double d1 =100 ;
	
	
}
public class TypeCasting {

	static void test(int a, double d)
	{
		System.out.println("a="+a+"d="+d);
	}
	
	static void test(double d, int a)
	{
		System.out.println("a="+a+"d="+d);
	}

	public static void main(String[] args) {
		
		test(10.0,100);

	}

}
