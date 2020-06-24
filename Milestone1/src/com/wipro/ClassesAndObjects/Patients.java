package com.wipro.ClassesAndObjects;
class Patient
{
   
    double BMI(double height,double weight)
    {
        return( weight*703 / ( height * height ) ) ;
    }
}
public class Patients{
    public static void main(String args[])
    {
        String name;
     //   double height,weight;
        Patient p=new Patient();
        String s[][]=new String[10][2];
        int i;
        for(i=0;i<10;i++)
        {
            name=args[i];
            s[i][0]=name;
            s[i][1]=Double.toString(p.BMI(Math.random()*100,Math.random()));
           
        }
        for(i=0;i<10;i++)
        {
           double d=Double.parseDouble(s[i][1]);
           if(d>25.0)
            System.out.println(s[i][0]+" "+s[i][1]);
           
        }
    }
}



