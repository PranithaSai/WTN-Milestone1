package com.wipro.Strings;
import java.util.*;
public class Palindrome {
	 public static void main(String args[])
	    {
	     Scanner sc=new Scanner(System.in);
	     String s=sc.next();
	     int i,count=0,j;
	     for(i=0,j=s.length()-1;i<=j;i++,j--)
	     {
	         if(s.charAt(i)!=s.charAt(j))
	         {
	         count++;
	         break;
	         }
	     }
	     if(count==0)
	     System.out.print("palindrome");
	     else
	     System.out.print("not palindrome");
	     sc.close();
	     
	    }
	

}
