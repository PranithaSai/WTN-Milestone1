package com.wipro.arrays;

import java.util.Arrays;

public class Array8 {
	public static void main(String[] args)
	{
		int n=args.length;
	    int a[]=new int[n];
	    int temp[]=new int[n];
	    int i;
	    for(i=0;i<args.length;i++)
	    {
	    	a[i]=Integer.parseInt(args[i]);
	    }
	    Arrays.sort(a);
		  int j = 0;  
	        for ( i=0; i<n-1; i++){  
	            if (a[i] != a[i+1]){  
	                temp[j++] = a[i];  
	            }  
	         }  
	        temp[j++] = a[n-1];       
	        for(i=0;i<j;i++)
	        {
	        	System.out.print(temp[i]+" ");
	        }
		
		
	}

}
