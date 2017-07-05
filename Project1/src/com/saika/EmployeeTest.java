package com.saika;

public class EmployeeTest {

	public static void main(String[]args){
		Employee e1=new Employee("adwfaw");
		Employee e2=new Employee("sdfaswe");
		
		e1.empAge(30);
		e1.empSalary(12321);
		e1.empDesignation("software devloper");
		e1.printEmployee();
		e2.empAge(49);
		e2.empSalary(10031);
		e2.empDesignation("software devloper");
		e2.printEmployee();
	}
	
}
