package com.vinay.synechron.AbstractClassExamples;

abstract class ParentClassExample 
{
	public void test1() 
	{
		System.out.println("test1");
	}
	
	public void test2()
	{
		System.out.println("test2");
	}
	
	public abstract void smoke() ;
	
	
	
	
}

public class AutoUpCasting extends ParentClassExample {
	
	public void test3()
	{
		System.out.println("test3");
	}
	
	public static void main(String[] args) {
				
		AutoUpCasting obj1 = new AutoUpCasting() ;
		obj1.test1();
		obj1.test2();
		obj1.test3();
		
		ParentClassExample obj2 = (ParentClassExample)new AutoUpCasting();
		obj2.test1();
		obj2.test2();				
		
	}

	@Override
	public void smoke() {
		System.out.println("test4");
		
	}

}
