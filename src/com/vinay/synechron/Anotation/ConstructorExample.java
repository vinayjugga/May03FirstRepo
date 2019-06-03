package com.vinay.synechron.Anotation;

class A 
{
	A(int a)
	{
		System.out.println("A class");
	}
}

class B extends A 
{
	B(int b)
	{
		super(10);
		System.out.println("B class");
	}
	
	public void display() 
	{
		System.out.println("display");

	}
}
public class ConstructorExample extends B{
	
	ConstructorExample(int c)
	{		super(20);
		System.out.println("ConstructorExample");
		
	}
	
	public void display()
	{
		super.display();
		System.out.println("disaplye2");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample(10) ;
		obj.display();
		System.out.println("done");
	}

}
