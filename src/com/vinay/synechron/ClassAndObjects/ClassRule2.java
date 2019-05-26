package com.vinay.synechron.ClassAndObjects;

public class ClassRule2 {

	public static void main(String[] args) {		
		System.out.println("A source file can have multiple non-public classes");
		
		FourClass anotherClass = new FourClass() ;
		anotherClass.display();

	}

}

class AnotherClass 
{
	public void syso() {
		System.out.println(getClass().getName());
	}
}

class ThridClass
{
	
}
class FourClass
{
	public void display() {
		System.out.println(getClass().getName());
	}
}


