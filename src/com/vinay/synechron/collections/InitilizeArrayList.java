package com.vinay.synechron.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class InitilizeArrayList {

	public static void main(String[] args) {
		/*ArrayList<Type> obj = new ArrayList<Type>(
		        Arrays.asList(Object o1, Object o2, Object o3, ....so on));*/		

		ArrayList<String> obj = new ArrayList<String>(
				Arrays.asList("vinay","gopi","Raj","ravi"));		
		System.out.println("String ArryList:="+obj);

		ArrayList<Integer> obj1 = new ArrayList<Integer>(
				Arrays.asList(10,20,30,50,60));		
		System.out.println("Integer ArryaList:="+obj1);

		List<String> a1 = new ArrayList<String>() ;	
		List<String> a2 = new LinkedList<String>() ;
		List<String> a3 = new Vector<String>();

		a1.add("vinay") ;
		a1.add("Ravi") ;
		a1.add("raju babu") ;		
		System.out.println("List Interface :="+ a1);	

		ArrayList<Integer> intlist = new ArrayList<Integer>(Collections.nCopies(10, 2));
		System.out.println("ArrayList items: "+intlist);

		LinkedList<String> copylist = new LinkedList<String>();
		copylist.addAll(obj);		  
		System.out.println(copylist);
		
		Object str= copylist.clone();
		System.out.println(str);


	}

}
