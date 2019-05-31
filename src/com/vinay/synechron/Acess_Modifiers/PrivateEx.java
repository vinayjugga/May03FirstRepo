package com.vinay.synechron.Acess_Modifiers;

class A {
	
}


public class PrivateEx {
	
	private int a ;
	
	private void privateMethod()
	{
		System.out.println("Private method");
	}

	public static void main(String[] args) {
		/*
		 * DefaultModifier obj = new DefaultModifier() ; obj.display();
		 */
		PrivateEx obj1 = new PrivateEx();
		obj1.privateMethod();
		
		/*
		 * PublicExample obj2 = new PublicExample() ; obj2.publicMethod();
		 */

	}

}
