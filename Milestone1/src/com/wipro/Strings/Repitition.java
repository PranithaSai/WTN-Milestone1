package com.wipro.Strings;

import java.util.Scanner;

public class Repitition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     int n=sc.nextInt();
	     int l=s.length();
	     for(int i=1;i<=n;i++)
	     {
	     System.out.print(s.substring(l-n,l));
	     }
	     sc.close();
	}

}
