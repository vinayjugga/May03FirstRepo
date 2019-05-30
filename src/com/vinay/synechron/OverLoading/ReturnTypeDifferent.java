package com.vinay.synechron.OverLoading;

public class ReturnTypeDifferent {

	public static void display()
	{
		System.out.println("Vinay ");
	}
	
	/*public void display()
	{
		System.out.println("M L");
	}
	public int display()
	{
		System.out.println("Return interger");
		return 0 ;
	}
	*/
	
	public static void main(String[] args) {
		System.out.println("Example of same method name but return type different");
		display();
		System.out.println("Successfuly printed");
		ReturnTypeDifferent twentyOne21Obj = new ReturnTypeDifferent();
		//twentyOne21Obj.display();
		
		

	}


}
