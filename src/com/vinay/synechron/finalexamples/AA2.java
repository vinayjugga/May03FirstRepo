package com.vinay.synechron.finalexamples;

/*what is output if the local final variable not initialized */
/* What is the output, if the re-initialized the final variable */

public class AA2 {

	public static void main(String[] args) {
		
		final int a  ;	
		//System.out.println("value of final variable a := "+ a);		
		a =200 ;
		System.out.println("Final variable a:="+a);
		//a= 300 ;
		System.out.println("Final variable a:="+a);
	}

}
