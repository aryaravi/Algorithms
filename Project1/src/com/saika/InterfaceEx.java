package com.saika;

interface AddEx{
	public void add();
	public void method1();
	
}
public class InterfaceEx implements  AddEx{
	

	static int add (int a ,int b){
	  	int  c= a+b;
		System.out.println("Sum"+ c);
	}
		
	public static void method1() {
	System.out.println("");
}
	public static void main(String[] args){
	method1();	
	}
}