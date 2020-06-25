package com.wipro.Abstraction;
import java.util.*;
abstract class GeneralBank{
	abstract double getSavingsIntrestRate(double amount);
	abstract double getFixedBepositIntrestRate(double amount1);	
}
class ICICIBank extends GeneralBank
{
	 double getSavingsIntrestRate(double amount)
	 {
		 return(0.04*amount);
	 }
	 double getFixedBepositIntrestRate(double amount1)
	 {
		 return(0.085*amount1);
	 }
}
class KotMBank extends GeneralBank
{
	 double getSavingsIntrestRate(double amount)
	 {
		 return(0.06*amount);
	 }
	 double getFixedBepositIntrestRate(double amount1)
	 {
		 return(0.09*amount1);
	 }
}
public class Banking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		System.out.println("Enter 0 for ICICIBank and 1 for KotMBank ");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("Enter amount for savings");
			double s=sc.nextDouble();
			System.out.println("Enter amount for fixed deposit");
			double f=sc.nextDouble();
			System.out.println("Intrest for savings");
			double res1=i.getSavingsIntrestRate(s);
			System.out.println(res1);
			System.out.println("Intrest for fixed deposit");
			double res2=i. getFixedBepositIntrestRate(f);
			System.out.println(res2);
			
		}
		else
		{
			System.out.println("Enter amount for savings");
			double s=sc.nextDouble();
			System.out.println("Enter amount for fixed deposit");
			double f=sc.nextDouble();
			System.out.println("Intrest for savings");
			double res1=k.getSavingsIntrestRate(s);
			System.out.println(res1);
			System.out.println("Intrest for fixed deposit");
			double res2=k. getFixedBepositIntrestRate(f);
			System.out.println(res2);
		}
		sc.close();	
	}

}
