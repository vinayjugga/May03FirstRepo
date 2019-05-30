package com.vinay.synechron.constructors;

public class ConstructorEx {
		
	  public ConstructorEx() {
	  System.out.println("Default constructor");
	  }	 
	
	  public ConstructorEx(int a) {
	  System.out.println("Paramter constructor");
	  }
	 
	public static void main(String[] args) {
		
		ConstructorEx obj = new ConstructorEx(10);
		
	}

}
