package com.saika.ProjectP;

public class Salary extends Employee {
	private double salary;
	
	public Salary(String name,String address,int number,double salary){
		super(name,address,number);
		setSalary(salary);
	}


public void mailCheck(){
	
	System.out.println("within mailCheck");
	System.out.println("getName() +salary");
}


public double getSalary() {
	return salary;
}


public void setSalary(double newSalary) {
	if(newSalary >=0.0){
	this.salary =newSalary;}
}

public double computePay(){
	System.out.println("Salary per year"+getNmae());
	return salary/52;
}
}
