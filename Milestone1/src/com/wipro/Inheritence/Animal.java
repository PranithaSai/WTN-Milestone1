package com.wipro.Inheritence;
class Bird extends Animal
{
	public void eat() {
		System.out.println("Bird eats");
	}
	public void sleep()
	{
		System.out.println("Bird Sleeps");
	}
	public void fly() {
		System.out.println("Bird fly");
	}
}

public class Animal {
	  void eat()
		{
			System.out.println("Animal eats");
		}
		void sleep()
		{
			System.out.println("Animal sleeps");
		}
public static void main(String[] args)
{
  
	Animal a=new Animal();
	a.eat();
	a.sleep();
	Bird b=new Bird();
	b.eat();
	b.sleep();
	b.fly();
	
}
}
