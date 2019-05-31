package com.vinay.synechron.Acess_Modifiers;

class B
{
	private void test5()
	{
		System.out.println("test5");
	}
	void test6()
	{
		
	}
}

public class ProtectedExample extends B {
	
	private int b ;
	
	
	public void get(int b)
	{
		this.b =b ;
	}
	
	protected void protecteMethod() 
	{
		System.out.println("Proteccted method ");
	}
	
	private void display() 
	{
		System.out.println("Private method");
	}
	
	void test2()
	{
		System.out.println("default access");
	}
	
	public void test3() 
	{
		System.out.println("public");
	}
	

	public static void main(String[] args) {
		ProtectedExample obj = new ProtectedExample();
		obj.protecteMethod();
		
		B b = new B() ;
		
		

		/*DefaultModifier obj = new DefaultModifier() ;
		obj.display();
		
		PrivateEx obj1 = new PrivateEx();
		obj1.privateMethod();
		
		PublicExample obj2 = new PublicExample() ;
		obj2.publicMethod();*/
	}

}
