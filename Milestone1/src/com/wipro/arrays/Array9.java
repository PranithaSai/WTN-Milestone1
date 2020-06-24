package com.wipro.arrays;

public class Array9 {
	public static void main(String[] args) {
	   int n=0;
	    int a[][]=new int[3][3];
	    int i,j;
	    for(i=0;i<3;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    	a[i][j]=Integer.parseInt(args[n]);
	    	n++;
	    	}
	    }
	    int max=0;
	    for(i=0;i<3;i++)
	    {
	    	for(j=0;j<3;j++)
	    	{
	    		if(max<a[i][j])
	    			max=a[i][j];
	    	}
	    }
	    System.out.println(max);
		
	}

}
