package com.wipro.Abstraction;
abstract class Compartment
{
	public abstract String Notice();
}
class FirstClass extends Compartment
{
	public String Notice()
	{
		return("First class compartment is ready");
	}
}
class Ladies extends Compartment
{
	public String Notice()
	{
		return("Ladies class compartment is ready");
	}
}
class General extends Compartment
{
	public String Notice()
	{
		return("General class compartment is ready");
	}
}
class Luggage extends Compartment
{
	public String Notice()
	{
		return("luggage class compartment is ready");
	}
}

public class TestCompartment {
	 static int Randint(int a,int b)
    {
       int range=b-a+1;
       int ran=(int)(Math.random()*range)+a;
       return ran;
        
    }
	public static void main(String[] args) {
		 
		int com[]=new int[10];
		int i;
		for(i=0;i<10;i++)
		{
			com[i]=TestCompartment.Randint(1,4);
		}
		FirstClass f=new FirstClass();
		Ladies l=new Ladies();
		General g=new General();
		Luggage u=new Luggage();
		for(i=0;i<10;i++)
		{
			if(com[i]==1)
				System.out.println(f.Notice());
			else if(com[i]==2)
				System.out.println(l.Notice());
			else if(com[i]==3)
				System.out.println(g.Notice());
			else
				System.out.println(u.Notice());
				
				
		}
		
	}

}
