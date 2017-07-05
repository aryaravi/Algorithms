package com.stringEx;

public class StringEx1 {
	


	public static void main(String[] args) {

		char[] hello={'h','e','l','l','o'};
		String s1="first dstring s1";
		String s2="second string s2";
		String s3="third String S3";
		String helloS=new String(hello);
		System.out.println(helloS);
		System.out.println(hello.length);
		
		char r=helloS.charAt(3);
		System.out.println(r);
		int t=0;
		t=s1.compareTo(s2);
		System.out.println(t);
		 t=s3.compareTo(s2);
		System.out.println(t);
		System.out.println(helloS.hashCode());
		
	}

}
