package com.wipro.Strings;

import java.util.Scanner;

public class FirstLast {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     int n=s.length();
	     System.out.println(s.substring(1,n-1));
	     sc.close();
	}

}
