package com.saika;

public class ForEachEx {
	
	public static void main(String args[]){
	int[]n={10,20,30,40,50};
	for(int x: n){
		System.out.print(x+",");
	} System.out.print("\n");
    String [] names = {"James", "Larry", "Tom", "Lacy"};

    for(String name: names){
		System.out.print(name+",");
    }
}
}