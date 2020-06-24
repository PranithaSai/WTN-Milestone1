package com.wipro.Inheritence;
class Perso{
    String name;
}
class Employe extends Perso{
    double annual_sal;
    String year;
    String insu_num;
    void setsal(double annual_sal)
    {
        this.annual_sal=annual_sal;
    }
    void setyear(String year)
    {
        this.year=year;
    }
    void setnum(String insu_num)
    {
        this.insu_num=insu_num;
    }
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
        return(name);
    }
    Double getsal()
    {
        return annual_sal;
    }
    String getyear()
    {
        return year;
    }
    String getins()
    {
        return insu_num;
    }
}
public class  TestEmployee{
    public static void main(String args[])
    {
        Employe e=new Employe();
        e.setName("pranitha");
        e.setsal(100000);
        e.setnum("A123R");
        e.setyear("2020");
        System.out.println(e.getName());
          System.out.println(e.getsal());
          System.out.println(e.getyear());
            System.out.println(e.getins());
    }
}