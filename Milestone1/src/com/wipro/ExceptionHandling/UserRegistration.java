package com.wipro.ExceptionHandling;

import java.util.*;

class InvalidCountryExeption extends Exception
{
	private static final long serialVersionUID = 1L;

	public InvalidCountryExeption(String user)
	{
		System.out.println("User "+user+" outside India  cannot be registered");
	}
}
public class UserRegistration {
	
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int t = sc.nextInt();
	while(t-->0)
	{
		String name = sc.next();
		String country = sc.next();
		try {
			UserRegistration.registerUser(name,country);
		}
		catch (InvalidCountryExeption e) {
			System.out.println(e);
		}
	}
		sc.close();
	}
	
static void registerUser(String username,String userCountry) throws InvalidCountryExeption 
{
	
		if(userCountry.equalsIgnoreCase("India"))
			System.out.println("User "+username+" registration done successfully");
		else
			throw new InvalidCountryExeption(username);
}

}
