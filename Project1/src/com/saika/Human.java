
package com.saika;

public class Human {
	String name;
	int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Human(String name){
		System.out.println("dawedfawef"+name );
	}
public static void main(String[]args){
	Human h=new Human("ronney");
	h.setAge(10);
	h.getAge();
	System.out.println(h.age);
}
}
