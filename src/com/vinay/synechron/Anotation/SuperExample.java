package com.vinay.synechron.Anotation;

class superParent 
{
	superParent()
	{
		System.out.println("SuperParent");
	}
}

class parent extends superParent
{
	parent()
	{
		//super() ;
		System.out.println("Parent");
	}
	
}


public class SuperExample extends parent {

	SuperExample()
	{
		//super();
		System.out.println("Super Example");
	}
	
	public static void main(String[] args) {
		
		SuperExample obj = new SuperExample();
		//System.out.println("super method example");

	}

}
