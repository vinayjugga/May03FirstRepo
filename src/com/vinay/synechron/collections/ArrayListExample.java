package com.vinay.synechron.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<String>() ;		
		System.out.println("Is ArrayList Empty: "+a1.isEmpty());
		
		a1.add("vinay") ;
		a1.add("Ravi") ;
		a1.add("raju babu") ;		
		System.out.println(a1);	
		
		System.out.println("Is ArrayList Empty: "+a1.isEmpty());
		System.out.println("ArrayList size:="+a1.size());		
		a1.add("vinay") ;
		a1.add("Ravi") ;
		
		System.out.println(a1);
		System.out.println("ArrayList size:="+a1.size());
	}

}
