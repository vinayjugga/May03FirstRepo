package com.vinay.synechron.Acess_Modifiers;

public class ProtectedExample {
	
	protected void protecteMethod() 
	{
		System.out.println("Proteccted method ");
	}

	public static void main(String[] args) {
		ProtectedExample obj = new ProtectedExample();
		obj.protecteMethod();

		/*DefaultModifier obj = new DefaultModifier() ;
		obj.display();
		
		PrivateEx obj1 = new PrivateEx();
		obj1.privateMethod();
		
		PublicExample obj2 = new PublicExample() ;
		obj2.publicMethod();*/
	}

}
