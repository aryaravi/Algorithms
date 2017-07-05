package com.saika;

public class Employee1 extends Employee  {

	public String name;
	private int salary;
	
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
	public Employee1(String name){
		this.name=name;
	}
	public void printemp(){
		System.out.println(name);
		System.out.println(salary);
	}
	
	
	public static void main(String args[]){
		
		Employee1 e1=new Employee1("ravi");
		e1.setSalary(13123);
		e1.printemp();
	}
}
