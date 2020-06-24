package com.wipro.forloop;

public class Forloop7 {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		while(a>0)
		{
			int r=a%10;
			System.out.print(r);
			a=a/10;
		}
		
	}

}
