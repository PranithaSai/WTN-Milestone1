package com.wipro.Polymorphism;

class Shape
{
  void draw()
  {
       System.out.println("Shape is being drawn");
  }
  void erase(){
       System.out.println("Shape is erased");
  }
}
class Circle extends Shape
{
   void draw()
   {
       System.out.println("Draw Circle");
   }
   void erase()
   {
       System.out.println("erase a circle");
   }
}
class Triangle extends Shape
{
   void draw()
   {
       System.out.println("triangle");
   }
   void erase()
   {
       System.out.println("erase a triangle");
   }
}
class Square extends Shape
{
   void draw()
   {
       System.out.println("Draw square");
   }
   void erase()
   {
       System.out.println("erase a square");
   }
}
public class Test
{
   public static void main(String args[])
   {
       Shape s=new Shape();
       s.draw();
       s.erase();
       Shape p=new Circle();
       p.draw();
       p.erase();
       Shape t=new Triangle();
       t.draw();
       t.erase();
       
   }
}
