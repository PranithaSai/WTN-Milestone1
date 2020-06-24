package com.wipro.Polymorphism;

class Fruit{
    String name;
    String taste;
    float size;
    void eat(){
    System.out.println("Fruits are good for health");
    }
}
class Apple extends Fruit{
    void eat()
    {
        System.out.println("The fruit is apple");
        System.out.println("Apple size is 10g");
         System.out.println("Apple taste is good");
    }
}
class Orange extends Fruit
{
    void eat()
    {
        System.out.println("The fruit is orange");
        System.out.println("orange size is 20g");
         System.out.println("orange taste is sour");
    }
}
public class Test1{
    public static void main(String args[])
    {
        Fruit f=new Fruit();
        f.eat();
        Fruit p=new Apple();
        p.eat();
        Fruit s=new Orange();
        s.eat();
    }
}
