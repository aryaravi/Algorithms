package com.saika;

public class FreshJuice {
	   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
	   FreshJuiceSize size;
	}

	class Test {

	   public static void main(String args[]) {
	      FreshJuice juice = new FreshJuice();
	      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
	      System.out.println("Size: " + juice.size);
	   }
	}