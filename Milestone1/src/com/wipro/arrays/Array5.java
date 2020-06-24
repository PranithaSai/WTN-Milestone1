package com.wipro.arrays;

public class Array5 {
	public static void main(String[] args) {
		
	
	 int n=args.length;
	    int a[]=new int[n];
	    int i;
	    int max=0,min=99999;
	    int max1=0,min1=99999;
	    for(i=0;i<args.length;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    	if(a[i]>max)
	    	{
	    		max1=max;
	    		max=a[i];
	    	}
	    	if(a[i]<min)
	    	{
	    		min1=min;
	    		min=a[i];
	    	}
	    		
	    }
	    System.out.println(max1);
	    System.out.println(max);
	    System.out.println(min1);
	    System.out.println(min);
	
	}
}


