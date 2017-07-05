package com.saika;

public class InstanceVarEx {

	public String name;
	private int salary;
	
	
	public InstanceVarEx(String name){
	this.	name=name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
	public void printVarEx(){
		System.out.println(name);
		System.out.println(salary);		
	}
	
	
	public static void main(String args[]){
		InstanceVarEx ive=new InstanceVarEx("ravi");
		ive.setSalary(23413);;
		ive.printVarEx();
	}
	}
	

