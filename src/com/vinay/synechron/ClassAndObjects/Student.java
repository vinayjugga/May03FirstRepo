package com.vinay.synechron.ClassAndObjects;

public class Student {
	
	String name ="Vinay" ; //global variable 
	
	public void display() //method 
	{
		System.out.println("Name displayed: "+name);
	}

	public static void main(String[] args) {
		
		Student student = new Student() ; //// Created an object
		student.display(); // call method

	}

}
