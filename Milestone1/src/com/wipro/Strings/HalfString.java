package com.wipro.Strings;

import java.util.Scanner;

public class HalfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     int n=s.length();
	     if(n%2!=0)
	    	 System.out.println("null");
	     else
	    	 System.out.println(s.substring(0,n/2));
	     sc.close();
	}

}
