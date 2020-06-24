package com.wipro.forloop;

public class Forloop4
{
	public static void main(String[] args) {
		
		for(int j=10;j<=99;j++)
		{
			int count=2;
		for(int i=3;i<=j/2;i++)
		{
			if(j%i==0)
			{
				count++;
				break;
			}
		}
		if(count==2)
			System.out.println(j);
		}
		
		
	}
	
}
