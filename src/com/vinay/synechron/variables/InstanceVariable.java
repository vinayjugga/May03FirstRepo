package com.vinay.synechron.variables;

public class InstanceVariable {
	
	String objInstVar = "Instance variable" ;

	public static void main(String[] args) {

		InstanceVariable obj1 = new InstanceVariable() ;
		InstanceVariable obj2 = new InstanceVariable() ;
		InstanceVariable obj3 = new InstanceVariable() ;
		
		System.out.println(obj1.objInstVar);
		System.out.println(obj2.objInstVar);
		System.out.println(obj3.objInstVar);		
		
		obj1.objInstVar ="Modified Instance" ;
		
		System.out.println(obj1.objInstVar);
		System.out.println(obj2.objInstVar);
		System.out.println(obj3.objInstVar);
		

	}

}
