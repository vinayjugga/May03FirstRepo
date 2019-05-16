package com.vinay.synechron.finalexamples;

/* Write a program to declare the Final value */

public class AA {

	public final double PI =3.14 ;

	public void display(){
		System.out.println("constant value of :="+PI);
	}
	
	public static void main(String[] args) {
		AA a = new AA() ;
		a.display();
		//System.out.println("Static Final value:="+PI);

	}

}
