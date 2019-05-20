package com.vinay.synechron.variables;

/* what is the output , if re-initialized the local and static variable values */

public class FF {
	
	static int empID =1000 ;
	int a1= 200;

	public static void main(String[] args) {
		
		FF fobj = new FF() ;
		FF fobj2 = new FF() ;
		fobj.a1 =100 ;
		System.out.println("Value of a1:="+fobj.a1);
		
		System.out.println("Value of EmpID:="+empID);
		empID =2000 ;
		System.out.println("Value of re-EmpID:="+empID);
		int empID=300 ;
		System.out.println("Value of re-EmpID:="+empID);
		empID =400 ;
		System.out.println("Value of re-EmpID:="+empID);
		empID =5000 ;
		System.out.println("Value of re-EmpID:="+FF.empID);	
		System.out.println("Value of re-EmpID:="+fobj2.a1);			

	}

}
