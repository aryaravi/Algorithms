package com.saika;

public class Employee {
    String name;
	int age;
	int salary;
	String designation;
	public Employee(String name){
		this.name=name;
	}
public void empAge(int age){
	this.age=age;
}

public void empDesignation(String designation){
	this.designation =designation;
}

public void empSalary(int salary){
	this.salary=salary;
}
public  void printEmployee(){
	
	System.out.println(name);
	System.out.println(age);
	System.out.println(designation);
	System.out.println(salary);
}
}
