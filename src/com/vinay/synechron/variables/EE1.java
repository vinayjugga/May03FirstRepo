package com.vinay.synechron.variables;

/* what is output , if the static variable value re initialized */

public class EE1 {

	static int empID= 200 ;
	
	public static void main(String[] args) {
		
		System.out.println("Stativ variable re-initalized:=");
		System.out.println("Value of empID:="+empID);
		empID =300 ;
		System.out.println("Value of empID:="+empID);

	}

}
