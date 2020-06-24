package com.wipro.arrays;

public class Array7 {
	public static void main(String[] args)
	{
		int n=args.length;
		System.out.println(n);
		int find=Integer.parseInt(args[n-1]);
	    int a[]=new int[n-1];
	    int i;
	    for(i=0;i<args.length-1;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    }
	    for(i=0;i<n-1;i++)
	    {
	    	if(find==a[i])
	    	{
	    		System.out.println(i);
	    		System.exit(0);
	    	}
	    }
	    System.out.println("-1");
	}

}
