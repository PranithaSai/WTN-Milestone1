package com.wipro.Strings;

import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	     String a=sc.next();
	     int l1=a.length();
	     String b=sc.next();
	     String s;
	     if(a.charAt(l1-1)==b.charAt(0))
	     {
	    	 s=a.substring(0,l1-1)+b;
	          System.out.println(s.toLowerCase());
	     }
	     else
	     {
	    	 s=a+b;
	    	 System.out.println(s.toLowerCase());
	     }
	     sc.close();
	    	 
	}

}
