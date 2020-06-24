package com.wipro.Inheritence;
class Person1
{
    String name;
}
class Student extends Person1
{
    int  section;   
}
class Teacher extends Person1{
    double salary;
    String subject;
    Teacher( String name,double salary,String subject)
    {
        this.salary=salary;
        super.name=name;
        this.subject=subject;
        
    }
    void print()
    {
         System.out.println(super.name);
        System.out.println(salary);
        System.out.println(subject);
    }
}
class College extends Student{
    String year;
    String major;
    College(String name,String year,String major)
    {
        super.name=name;
        this.year=year;
        this.major=major;
    }
    void print()
    {
        System.out.println(super.name);
        System.out.println(year);
        System.out.println(major);
        
    }
}
public class Test
{
    public static void main(String args[])
    {
        College c=new College("Pranitha","2020","cse");
        Teacher t=new Teacher("sita",3456.23,"biology");
        c.print();
        t.print();
    }
}