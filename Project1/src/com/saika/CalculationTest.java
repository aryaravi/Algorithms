package com.saika;

public class CalculationTest extends Calcutation{

	
	public void multiplication(int x,int y){
		int z=x*y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		int a=4,b=6;
		
		
		CalculationTest ct=new CalculationTest();
		ct.addition(a,b);
		ct.subtraction(a,b);
		ct.multiplication(a,b);
		
	}

}
