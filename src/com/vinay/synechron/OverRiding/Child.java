package com.vinay.synechron.OverRiding;

public class Child extends Parent {
	
	public void disp(){
		System.out.println("Child class method");
	}
	
	public static void main( String args[]) {
		
		Child obj = new Child();
		obj.disp();
	}

}
