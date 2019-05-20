package com.vinay.synechron.variables;

public class LocalVariable {
	
	public void display()
	{
		int local = 20 ;
		System.out.println("Local variable access only inside display method"+ local);
	}

	public static void main(String[] args) {
		
		LocalVariable lobj = new LocalVariable();
				lobj.display();
		int local = 30 ;
		System.out.println("Local varable access only inside main method "+ local);
				
	}

}
