package com.wipro.forloop;

public class Whileloop1 {

	public static void main(String[] args) 
	{
		 int n=Integer.parseInt(args[0]);
		 int temp=n;
		 int r,reverse=0;
		 while (n != 0) {
		        r = n % 10;
		        reverse = reverse * 10 + r;
		        n /= 10;
		    }
		 if(temp==reverse)
			 System.out.println("Palindrome");
		 else
			 System.out.println("Not Palindrome");
	}
}
