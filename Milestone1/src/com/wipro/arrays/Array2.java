package com.wipro.arrays;

public class Array2 
{
	public static void main(String[] args) 
	{
	    int n=args.length;
	    int a[]=new int[n];
	    int i;
	    int max=0,min=Integer.parseInt(args[0]);
	    for(i=0;i<args.length;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    	if(a[i]>max)
	    		max=a[i];
	    	if(a[i]<min)
	    		min=a[i];
	    }
	    System.out.println(max);
	    System.out.println(min);
	
	}


}
