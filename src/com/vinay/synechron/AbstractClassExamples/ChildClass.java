package com.vinay.synechron.AbstractClassExamples;

public class ChildClass extends ParentClass {

	@Override
	public void display() {
		System.out.println("Child class implemented");
		
	}	
	
	public void test2()
	{
		System.out.println("Akash");
	}
	
	public void test1()
	{
		System.out.println("vekatesth");
	}
	
	public static void main(String args[])
	{
		ParentClass p1 = new ChildClass();			
		p1.display();
		
		ChildClass c1 = (ChildClass)p1;
		c1.test2();
		
		
		
		
	}

}
