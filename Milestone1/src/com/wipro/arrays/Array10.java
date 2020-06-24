package com.wipro.arrays;

public class Array10 {
	public static void main(String[] args) {
		int n=0,temp;
	    int a[][]=new int[2][2];
	    int i,j;
	    for(i=0;i<2;i++)
	    {
	    	for(j=0;j<2;j++)
	    	{
	    	a[i][j]=Integer.parseInt(args[n]);
	    	n++;
	    	}
	    }
	   temp=a[0][0];
	   a[0][0]=a[1][1];
	   a[1][1]=temp;
	   temp=a[0][1];
	   a[0][1]=a[1][0];
	   a[1][0]=temp;
	   for(i=0;i<2;i++)
	    {
	    	for(j=0;j<2;j++)
	    	{
	    	  System.out.print(a[i][j]+" ");
	    	}
	    	System.out.println();
	    }
	    
		
	}

}
