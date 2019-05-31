package com.vinay.synechron.Acess_Modifiers;

public class PublicExample {
	
	public void publicMethod()
	{
		System.out.println("Access to anywhhere");
	}

	public static void main(String[] args) {
		ProtectedExample obj = new ProtectedExample();
		obj.protecteMethod();
		
	}

}
