package com.vinay.synechron.Acess_Modifiers;

public class PublicExample {
	
	public void publicMethod()
	{
		System.out.println("Access to anywhhere");
	}

	public static void main(String[] args) {
		ProtectedExample obj = new ProtectedExample();
		obj.protecteMethod();
		
		
		
		/*
		 * PrivateEx obj1 = new PrivateEx(); obj1.privateMethod();
		 */
		
		/* A a1 = new A() ; */
		
	}

}
