package com.wipro.forloop;

public class Forloop8 
{
     public static void main(String[] args) 
     {
    	 int n=Integer.parseInt(args[0]);
    	 int i,j;
    	 for(i=1;i<=n;i++) {
    		 for(j=1;j<=i;j++)
    		 {
    			 System.out.print("* ");
    		 }
    		 System.out.println();
    	 }
	 }
}