package com.wipro.ifelse;

public class Ifelse7 {
	public static void main(String[] args) {
		String a=args[0];
		if(a.charAt(0)>='a' && a.charAt(0)<='z')
			System.out.println(a.toUpperCase());
		else
			System.out.println(a.toLowerCase());
	}

}
