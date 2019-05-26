package com.vinay.synechron.variables;

public class AsciiCodeOfCharacter {

	
	public static void main(String[] args) {

		char ch = 'A';
		char sm = 'a';
        int asciiCode = ch;
        // type casting char as int
        int asciiValue = ch;  //Auto Type casting 
        
        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
        System.out.println("ASCII value of "+ch+" is: " + (int)sm);

	}

}
