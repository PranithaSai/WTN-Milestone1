package com.wipro.Abstraction;
abstract class Instrument
{
	abstract void play();
}
class Piano extends Instrument{
	void play()
	{
		System.out.println("piano is playing tan tan tan tan");
	}
}
class Guitar extends Instrument{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin");
	}
}
class Flute extends Instrument{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot");
	}
}


public class Music {
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
			com[i]=Music.Randint(1,3);
		}
		Piano p=new Piano();
		Guitar g=new Guitar();
		Flute f=new Flute();
		for(i=0;i<10;i++)
		{
			if(com[i]==1)
			{
				p.play();
			}
			else if(com[i]==2)
			g.play();
			else 
				f.play();
				
				
		}
		
		
	}

}
