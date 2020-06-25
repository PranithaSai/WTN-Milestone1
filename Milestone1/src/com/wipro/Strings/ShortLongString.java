package com.wipro.Strings;

import java.util.Scanner;

public class ShortLongString 
{
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
	     String a=sc.next();
	     int l1=a.length();
	     String b=sc.next();
	     int l2=b.length();
	     if(l1>l2)
	    	 System.out.println(b+a+b);
	     else
	    	 System.out.println(a+b+a);
	     sc.close();
	}
}
