package com.wipro.forloop;

public class Forloop5 {
	public static void main(String[] args)
	{
		int count=2;
		if(args.length==0)
		{
			System.out.println("Please enter an integer number");
			System.exit(0);
		}
		int a=Integer.parseInt(args[0]);
		if(a==0||a==1)
		{
			System.out.println(a+ " is neither prime nor composite");
			System.exit(0);
		}
		else
		{
		
			for(int i=2;i<=a/2;i++)
			{
				if(a%i==0)
				{
					System.out.println(a+" is a composite number");
					System.exit(0);
				}
			}
		}
		if(count==2)
			System.out.println(a+" is a prime number");
	}

}
