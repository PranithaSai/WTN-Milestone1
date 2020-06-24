package com.wipro.forloop;

public class Forloop6 
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum=sum+r;
			a=a/10;
		}
		System.out.println(sum);
	}
    
    
}
