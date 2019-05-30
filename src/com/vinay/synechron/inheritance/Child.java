package com.vinay.synechron.inheritance;

public class Child extends Parent{
	
	String name ="abc" ;
	
	@Override
	public void smoke()
	{
		System.out.println("Chain somker");
	}
	

	public static void main(String[] args) {
		
		Child cobj = new Child() ;
		cobj.smoke();	
		

	}



}
