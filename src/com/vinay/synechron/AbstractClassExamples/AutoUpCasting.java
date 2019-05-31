package com.vinay.synechron.AbstractClassExamples;

class parentClassExample 
{
	public void test1() 
	{
		System.out.println("test1");
	}
	
	public void test2()
	{
		System.out.println("test2");
	}
	
}

public class AutoUpCasting extends parentClassExample {

	
	
	public static void main(String[] args) {
		
		parentClassExample obj = new parentClassExample();
		obj.test1();
		obj.test2();

	}

}
