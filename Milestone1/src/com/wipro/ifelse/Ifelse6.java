package com.wipro.ifelse;

public class Ifelse6 {
	public static void main(String[] args) {
		String gender=args[0];
	    int age=Integer.parseInt(args[1]);
	    if(gender=="Female")
	    {
	    	if(age>=1 && age <=58)
	    		System.out.println("8.2%");
	    	else
	    		System.out.println("9.2%");
	    }
	    else
	    {
	    	if(age>=1 && age <=58)
	    		System.out.println("8.4%");
	    	else
	    		System.out.println("10.5%");
	    }
	    	
	}


}
