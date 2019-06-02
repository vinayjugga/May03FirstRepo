package com.vinay.synechron.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {

	public static void main(String args[]) {
	      // HashSet declaration
	      HashSet<String> hset = 
	               new HashSet<String>();

	      // Adding elements to the HashSet
	      hset.add("Apple");
	      hset.add("Mango");
	      hset.add("Grapes");
	      hset.add("Orange");
	      hset.add("Fig");	      
	      System.out.println("Size of the HashSet:="+hset.size());
	      
	      //Addition of duplicate elements
	      hset.add("Apple");
	      hset.add("Mango");
	      
	      System.out.println("Size of the HashSet:="+hset.size());
	      
	      //Addition of null values
	      hset.add(null);
	      hset.add(null);
	      System.out.println(hset);
	      
	   // Creating a List of HashSet elements
	      List<String> fromHset = new ArrayList<String>(hset);
	      System.out.println("ArrayList contains: "+ fromHset);
	      
	      
	      System.out.println("Before: HashSet contains: "+ hset);
	      //Displaying HashSet elements 	      
	      hset.clear();	      
	      // Display HashSet content again
	      System.out.println("After: HashSet contains: "+ hset);
	      
	   // Creating a List of HashSet elements
	      List<String> list = new ArrayList<String>(hset);
	}
}
