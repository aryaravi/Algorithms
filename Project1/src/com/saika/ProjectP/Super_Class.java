package com.saika.ProjectP;

public class Super_Class {
	 
	int num =20;
	public void display(){
		System.out.println("this is super class");
	}

}
 class Sub_Class extends Super_Class{
	int num=10;
	public void display(){
		System.out.println("this is sub class");
	}		
		public void my_method(){
			Sub_Class sub=new Sub_Class();
			sub.display();
			super.display();
			
		}
		
		
		public static void main(String args []){
			
			Sub_Class obj=new Sub_Class();
			obj.my_method();
			
		}
	}
	
	
