package com.wipro.WrapperClasses;

public class Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e = new Employee("Teja");
		Employee eclone = e.clone();
		System.out.println("Name: "+e.name);
		System.out.println("Clone Name: "+eclone.name);
	}

}
