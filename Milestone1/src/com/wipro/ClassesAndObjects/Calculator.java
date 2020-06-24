package com.wipro.ClassesAndObjects;
import java.util.*;
public class Calculator {
	static int powerInt(int num1,int num2)
	{
		int result=(int)Math.pow(num1,num2);
		return result;
	}
	static double powerDouble(double num1,double num2)
	{
		double result=Math.pow(num1,num2);
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		System.out.println(Calculator.powerInt(a,b));
		System.out.println(Calculator.powerDouble(c,d));
		sc.close();
	}

}
