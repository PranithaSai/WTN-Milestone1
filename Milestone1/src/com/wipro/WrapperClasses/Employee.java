package com.wipro.WrapperClasses;

public class Employee {
	String name;
	public Employee(String name)
	{
		this.name=name;
		}

	public Employee clone()throws CloneNotSupportedException
	{
			return (Employee)super.clone();
	}

}
