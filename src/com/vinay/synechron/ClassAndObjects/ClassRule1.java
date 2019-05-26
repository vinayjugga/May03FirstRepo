package com.vinay.synechron.ClassAndObjects;

public class ClassRule1 {

	public static void main(String[] args) {
		
		System.out.println("There can be only one public class per source file");
		
		FourClass anotherClass = new FourClass() ;
		anotherClass.display();
		
	}

}

/*public class Anotherclass
{
	
}

public class ThridClass
{
	
}
*/