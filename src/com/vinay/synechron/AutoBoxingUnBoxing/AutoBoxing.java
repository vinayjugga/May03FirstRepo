package com.vinay.synechron.AutoBoxingUnBoxing;

public class AutoBoxing {
	
	public void display(Integer n)
	{
		System.out.println("AutoBoxing int to Interger using wrapper class :n ="+ n);
	}
	
/*	public void display(int a)
	{
		System.out.println("Int value a:="+a);
	}*/

	public static void main(String[] args) {
		
		String str ="123" ;
		String str1 ="123" ;
		int res = Integer.parseInt(str1) + Integer.parseInt(str) ;
		System.out.println(res);
		
		Integer n = new Integer(30) ;
		int a =10 ;
		AutoBoxing a1 = new AutoBoxing();
		a1.display(a);

	}

}
