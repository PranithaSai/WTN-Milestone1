package com.wipro.arrays;
import java.util.Arrays;
public class Array6 {
	public static void main(String[] args)
	{
		int n=args.length;
	    int a[]=new int[n];
	    int i;
	    for(i=0;i<args.length;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    }
	    Arrays.sort(a);
	    for(i=0;i<args.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    
	}

}
