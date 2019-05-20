package com.vinay.synechron.variables;

/* what is the output ,  if the static variable and local variable with same name */

public class EE {
	
	static int vinayID= 200 ;

	public static void main(String[] args) {

		System.out.println("Value of ID:="+vinayID);
		int vinayID =300 ;
		System.out.println("Value of ID:="+vinayID);

	}

}
