package com.vinay.synechron.ClassAndObjects;

public class Dog {

	// Instance Variables
    String breed;
    String size;
    int age;
    String color;
    
    public String getDogInfo() {
        return ("Breed is: "+breed +"\nSize is:"+size+"\n Age is:"+age+"\n color is: "+color);
    }
	public static void main(String[] args) {
		
		Dog dogObj = new Dog();
		dogObj.breed="Maltese";
		dogObj.size="Small";
		dogObj.age=2;
		dogObj.color="white";
        System.out.println(dogObj.getDogInfo());
	}

}
