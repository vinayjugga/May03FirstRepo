package com.vinay.synechron.variables;

/*write the program to access the Static variable using with/without class reference */
public class BB {

	static int vinayID = 9794 ;
	
	public static void main(String[] args) {

		System.out.println("Example of Static variable access inside the static Block ");
		System.out.println("Value of VinayID:="+vinayID);
		System.out.println("Acces the Static variable without/with Class Reference inside the class");
		System.out.println("Value of VinayID:="+BB.vinayID);
		
		
	}

}
