package com.vinay.synechron.Encapsulation;

public class Contractor {

	public static void main(String[] args) {
		
		Employee employee = new Employee() ;
		employee.setEmpSSN(1111) ;
		
		System.out.println("Employe name :="+employee.getEmpName());
		System.out.println("Employe SSN :="+employee.getEmpSSN());
		System.out.println("Employe Age :="+employee.getEmpAge());

	}

}
