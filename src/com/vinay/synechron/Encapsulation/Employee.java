package com.vinay.synechron.Encapsulation;

public class Employee {	

		private int ssn ;
		private String empName ;
		private int empAge ;
		
		
		public int getEmpSSN()
		{
		return ssn ;	
		}
		
		public String getEmpName()
		{
			return empName ;
		}
		
		public int getEmpAge()
		{
			return empAge ;
		}
		
		public void setEmpSSN(int newSSN)
		{
			ssn = newSSN;
		}
		
		public void setEmpName(String newName)
		{
			empName =newName ;
		}
		
		public void setEmpAge(int newAge)
		{
			empAge = newAge ;
		}
		public static void main(String[] args) {
			System.out.println("Example of Encapsulation Data hiding");
			Employee one1Obj = new Employee();
			one1Obj.setEmpName("Vinay");
			one1Obj.setEmpSSN(12345);
			one1Obj.setEmpAge(36);			
			System.out.println("Employe name :="+one1Obj.getEmpName());
			System.out.println("Employe SSN :="+one1Obj.getEmpSSN());
			System.out.println("Employe Age :="+one1Obj.getEmpAge());
			

		}	

}
