package com.wipro.ClassesAndObjects;
public class Box{
    double length;
    double width;
    double height;
    Box(double length,double width,double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    double volume()
    {
        return(length*width*height);
    }
    public static void main(String args[])
    {
        Box b=new Box(10,12,13);
        double result=b.volume();
        System.out.println(result);
       
    }
}