package com.wipro.ExceptionHandling;

import java.util.*;

class NegativeNumberException extends Exception
{

	private static final long serialVersionUID = 1L;

	public NegativeNumberException() {
			System.out.println("NegativeNumberException");
	}
	
}
class Value_out_of_RangeException extends Exception
{
	private static final long serialVersionUID = 1L;

	public Value_out_of_RangeException() {
			System.out.println("ValueoutofRangeException");
		
	}
}
public class Exception3 {
public static void main(String[] args)  {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	while(t-->0) {
		try
		{
		String name = sc.next();
		int subs[] = new int[3];
		for(int i=0;i<3;i++)
		{
			subs[i]=sc.nextInt();
			int d = subs[i];
			if(d<0) throw new NegativeNumberException();
			if(d>100) throw new Value_out_of_RangeException(); 
		}
		int sum =0;
		for(int i=0;i<3;i++)
		{
			sum = sum+subs[i];
		}
		double avg = sum/3;
		System.out.println(name+"'s average: "+avg);
			 
	}
		catch(NumberFormatException n)
		{
			System.out.println(n);
		}
		catch(NegativeNumberException n)
		{
			System.out.println(n);
		}
		catch(Value_out_of_RangeException v)
		{
			System.out.println(v);
		}
		
}
	sc.close();
}
}

