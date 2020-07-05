package com.wipro.ExceptionHandling;

class AgeException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	public AgeException(String person,int age)
	{
	System.out.println(person+" has Invalid age:"+age);	
	}
}
public class Exception4 {
public static void main(String[] args) {
	try
	{
	String name = args[0];
	int age = Integer.parseInt(args[1]);
	if(age>=18&&age<60) 
		System.out.println(name+" has valid age: "+age);
	else
		throw new AgeException(name,age);
}
	catch(AgeException a)
	{
		System.out.println(a);
	}
}
}

