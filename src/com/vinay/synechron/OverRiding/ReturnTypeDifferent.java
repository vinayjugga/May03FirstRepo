package com.vinay.synechron.OverRiding;
//what is the output if the return type is higher to lower
class ParentClass {
	public void disp()
	{
		System.out.println("Parent class method");
	}
}


class ReturnTypeDifferent extends ParentClass{
	
	/*protected void disp(){
		System.out.println("Child class method");
	}*/
	public static void main( String args[]) {
		ReturnTypeDifferent obj = new ReturnTypeDifferent();
		obj.disp();
	}
}
