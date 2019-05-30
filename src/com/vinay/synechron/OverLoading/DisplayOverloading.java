package com.vinay.synechron.OverLoading;

//when methods name are same but number of arguments are different
class sample {

	public void display(char c)
	{
		System.out.println(c);
	}
	
	public void display(char c, int num)
	{
		System.out.println(c +"" + num);
	}
	public void display(char c, int num, double f)
	{
		System.out.println(c +"" +num + f);
	}
}

public class DisplayOverloading
{
	public static void main(String args[])
	{
		sample displayOverloading = new sample();
		System.out.println("Overloading -Differnt number of paramentes in argument list:");
		displayOverloading.display('a');
		displayOverloading.display('b',10);
		displayOverloading.display('c',20,30.5);
		displayOverloading.display('d', 20);
	}
}

