package com.wipro.Strings;

import java.util.Scanner;

public class Ncopy {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     int n=s.length();
	     String p=s.substring(0,2);
	     int i;
	     for(i=1;i<=n;i++)
	     {
	    	 System.out.print(p);
	     }
		sc.close();
	}

}
