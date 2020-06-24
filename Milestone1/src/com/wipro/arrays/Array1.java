package com.wipro.arrays;

public class Array1 {
	
	public static void main(String[] args) 
	{
	    int n=args.length;
	    int a[]=new int[n];
	    int i;
	    int sum=0;
	    for(i=0;i<args.length;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    	sum=sum+a[i];
	    }
	    double average=sum/n;
	    System.out.println(sum);
	    System.out.println(average);
	
	}

}
