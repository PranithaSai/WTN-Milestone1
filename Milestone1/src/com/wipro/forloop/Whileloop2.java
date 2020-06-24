package com.wipro.forloop;

public class Whileloop2 {
	public static void main(String[] args)
	{
		int i=10;
		int count=0;
		while(count<=5)
		{
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				count=count+1;
			}
				i=i+10;
		}
		
	}

}
