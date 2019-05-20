package com.vinay.synechron.variables;

public class StaticClassVariable {
	
	public static String companyName ="Synechron" ; //class or static variable

	public static void main(String[] args) {
		
		StaticClassVariable obj1 = new StaticClassVariable() ;
		StaticClassVariable obj2 = new StaticClassVariable() ;
		StaticClassVariable obj3 = new StaticClassVariable() ;
		
		System.out.println(obj1.companyName);
		System.out.println(obj2.companyName);
		System.out.println(obj3.companyName);
		
		obj1.companyName ="Synechron-GTP" ;
		
		System.out.println(obj1.companyName);
		System.out.println(obj2.companyName);
		System.out.println(obj3.companyName);
		System.out.println("==========Class variable or Static =============");
		System.out.println(companyName);
		System.out.println(companyName);
		System.out.println(companyName);
		

	}

}
