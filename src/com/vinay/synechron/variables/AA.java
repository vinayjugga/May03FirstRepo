package com.vinay.synechron.variables;

//import com.vinay.synechron.ClassAndObjects.FourClass;

/* Primitive data types variables */
public class AA {

	public static void main(String[] args) {
		
		
		byte num =123 ;  //-127 to  -128 
		//byte num1 =130 ;
		
		short val =12345 ;  //4 byte
		long number = 123456789L ; //15 digit will hold 
		
		int a =10 ;  
		//int int num ber = 100; //Variables naming cannot contain white spaces
		float $b = 20.0f ; //Variable name can begin with special characters such as $ and _
		char c ='A' ;
		double d = 33.33 ;
		boolean status = false ;
		String employee ="vinay" ; //variable name should begin with a lower case letter
		String smallNumber ="12" ;//variables names that has more than one words.start the second word with capital letter 
		String smallnumber ="10" ;// not java coding standards
		
		System.out.println("Value of Byte:="+ num);
		System.out.println("Value of short:="+ val);
		System.out.println("Value of long:="+ number);
		System.out.println("Value of Integer:="+ a);
		System.out.println("Value of Float:="+ $b);
		System.out.println("Value of char :="+ c);
		System.out.println("Value of Double:="+ d);	
		System.out.println("Value of Boolean:="+ status);	
		
		/*FourClass anotherClass = new FourClass() ;
		anotherClass.display();*/ 
		//if the class as default, can't be accesed in the outside the package

	}

}
