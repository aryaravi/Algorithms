package com.saika;

public class ArrayEx {
	 public static void main(String[] args){
		
		 int [] n={1,2,4,3,3};
		 printArray(new int[]{3, 1, 2, 6, 4, 2});
		 System.out.println("\n");
		 for(int x:n){
		
			 System.out.print(x+",");
			
		 }
		 int Total=0;
		 for(int x:n){
				
			 Total += n[x];
	 }
		 System.out.println(Total);
		 
		 int max=n[0];
		 for(int x:n){
			 
			 if(n[x]>max)max=n[x];
		 }
		 System.out.println(max);
		 }
	 
	 
	 public static void printArray(int[] array) {
		   for (int i = 0; i < array.length; i++) {
		      System.out.print(array[i] + " ");
		     
		   }
		}
}
