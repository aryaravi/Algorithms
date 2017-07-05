package com.saika.ProjectP;

public class Animal {
	
	public void move(){
		
		System.out.println("Animal method");
	
	}}
class Dog extends Animal{
	 
	 
	 public void move(){
		 super.move();
		System.out.println("overraided method");
		}
	public void bark(){
		System.out.println("overraided method2");
	}
	}
	

 class Test{
		public static void main(String args[]){
			
			
			
			Animal a=new Animal();
			Animal b=new Dog();
			a.move();
			b.move();
			//b.bark();
		}
	}

