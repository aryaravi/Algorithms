package com.siaka.abstractEx;

public class Employee {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private String address;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	private int number;
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Employee(String name,String address,int number){
		this.name=name;
		this.address=address;
		this.number=number;
	}
public double computePay(){
	System.out.println("inside employee costpay");
	return 0.0;
}

public void mailCheck(){
	System.out.println("cherck mail"+this.name+this.address);
}
public String toString(){
	return name+""+address+""+number;
}

	public static void main(String[] args) {
	Employee e=new Employee("George W.,Tx,43");
	System.out.println("/n Call mailcheck using Employee refer");
	e.mailCheck();
	}

}
