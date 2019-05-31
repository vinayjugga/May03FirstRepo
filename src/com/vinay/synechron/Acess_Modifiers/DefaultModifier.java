package com.vinay.synechron.Acess_Modifiers;

public class DefaultModifier {
	
	int a ;
	
	void display()
	{
		System.out.println("Default Modifier");
	}

	public static void main(String[] args) {
		
		
		DefaultModifier obj = new DefaultModifier() ;
		obj.display();		

		/*PrivateEx obj1 = new PrivateEx();
		obj1.privateMethod();*/
		
		/*DefaultModifier obj = new DefaultModifier() ;
		obj.display();
		
		PrivateEx obj1 = new PrivateEx();
		obj1.privateMethod();
		
		PublicExample obj2 = new PublicExample() ;
		obj2.publicMethod();*/

	}

}
