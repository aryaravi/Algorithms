package com.saika;

public class MultiEx extends AddEx {
	
	int mul(int a ,int b){
	return a*b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  	add(5,5);
	  	sum(4,4);
       MultiEx s =new MultiEx();
       int mul=s.mul(4,5);
       System.out.println("Multiply =" + mul);
 
	 
 }
	
    static int add (int a ,int b){
  	int  c= a+b;
	System.out.println("Sum"+ c);
	
	return c;
		
	}
	
    static int sum(int z ,int w){
   	 int x=z+w;
  return x; 	 
}
}