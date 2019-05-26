package com.vinay.synechron.variables;

public class PrimitiveDataGlobal {

	
	byte num ;  //-127 to  -128 		
	short val  ;  //4 byte
	long number  ; //15 digit will hold 		
	int a  ;  		
	float b  ; 
	char c  ;
	double d  ;
	boolean status ;
	
	
	public static void main(String[] args) {
		
		PrimitiveDataGlobal globalVariable = new PrimitiveDataGlobal() ;
		
		System.out.println("8 PrimitiveDataTypes Default values: ");		
		System.out.println("Default Value of Byte:="+ globalVariable.num);
		System.out.println("Default Value of short:="+globalVariable. val);
		System.out.println("Default Value of long:="+ globalVariable.number);
		System.out.println("Default Value of Integer:="+ globalVariable.a);
		System.out.println("Default Value of Float:="+ globalVariable.b);
		System.out.println("Default Value of char :="+ globalVariable.c);
		System.out.println("Default Value of Double:="+ globalVariable.d);	
		System.out.println("Default Value of Boolean:="+ globalVariable.status);

	}

}
