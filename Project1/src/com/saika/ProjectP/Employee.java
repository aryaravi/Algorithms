package com.saika.ProjectP;

public class Employee {
	private String name;
	private String address;
	private int number;
	
	
	public Employee(String name,String address,int number){
		
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public void mailCheck(){
		System.out.println("maling check "+ this.name);
	}

	public String toString(){
		return name+address+number;
	}
	
	public String getName(){
		return name;
	}
	public String getAddress(){
		return address;
	}
	public String setAddress(String newAddress){
		return address;
	}
	public int getnumber(){
		return number;
	}
}
