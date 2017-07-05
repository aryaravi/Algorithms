package com.saika;

public class LocalVarEx {

	public void age(){
		int a=0,i;
		for(i=0;i<=10;i++){
		
			a=a+i;
		System.out.println(a);
		}
	
		}
		
		public static void main(String args[]) {
		   
			LocalVarEx lve=new LocalVarEx();
					lve.age();
		   }
		
	}
