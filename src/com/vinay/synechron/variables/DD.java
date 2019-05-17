package com.vinay.synechron.variables;

/* how to access the global variable or non static variable */

public class DD {
	
	public int a  ;
	public double b ;
	public char c ;
	public float dobj ;
	

	public static void main(String[] args) {

		DD d = new DD() ;	
				
		System.out.println("Global Value of Integer:="+ d.a);
		System.out.println("Global Value of Float:="+ d.b);
		System.out.println("Global Value of char :="+ d.c);
		System.out.println("Global Value of Double:="+ d.dobj);	

	}

}
