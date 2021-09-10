// Write a program to find the area of different geometrical shapes by using method overloading.

import java.util.*;
class shapesArea{
  String name;
  double area;
  double len, wid;
  double radius;
  double height, base;
  double side;

  public shapesArea(String n)
  {
    Scanner sc=new Scanner(System.in);
    if(n.equalsIgnoreCase("Square"))
    {
        name = n;
        System.out.println("ENTER SIDE OF THE SQUARE  : ");
        side = sc.nextDouble();
        area = calcArea(name,side);
    }

    if(n.equalsIgnoreCase("Circle"))
    {
        name = n;
        System.out.println("ENTER RADIUS OF THE CIRCLE  : ");
        radius = sc.nextDouble();
        area = calcArea(name,radius);
    }

    if(n.equalsIgnoreCase("Rectangle"))
    {
        name = n;
        System.out.println("ENTER LENGTH OF THE RECTANGLE  : ");
        len = sc.nextDouble();
        System.out.println("ENTER BREADTH OF THE RECTANGLE  : ");
        wid = sc.nextDouble();
        area = calcArea(name,len,wid);
    }

    if(n.equalsIgnoreCase("Triangle"))
    {
        name = n;
        System.out.println("ENTER HEIGHT OF THE TRIANGLE  : ");
        height = sc.nextDouble();
        System.out.println("ENTER BASE OF THE TRIANGLE  : ");
        base = sc.nextDouble();
        area = calcArea(name,height,base);
    }

  }
  double calcArea(String n,double a)
  {
    double ar = 0;
    if(n.equalsIgnoreCase("SQUARE"))
    {
        ar = a * a;
    }
    if(n.equalsIgnoreCase("CIRCLE"))
    {
       ar = 3.14 * a * a;
    }
    return ar;
  }

  double calcArea(String n,double a,double b)
  {
    double ar = 0;
    if(n.equalsIgnoreCase("RECTANGLE"))
    {
        ar = a * b;
    }
    if(n.equalsIgnoreCase("TRIANGLE"))
    {
       ar = 0.5 * a * b;
    }
    return ar;
  }

  void printData()
  {
    System.out.println("AREA OF " +name+" IS :  "+area);
  }

}

class shapesas2{
  public static void main(String[] args){
    String nm;
    int ctr = 1;
    Scanner sc=new Scanner(System.in);
    while(ctr!=0)
    {
    System.out.println("ENTER THE NAME OF SHAPE (SQUARE,RECTANGLE,TRIANGLE,CIRCLE) : ");
    nm = sc.nextLine();
    shapesArea shape = new shapesArea(nm);
    shape.printData();
    System.out.println("PRESS 0 TO EXIT OR 1 TO REPEAT");
    ctr = sc.nextInt();
    sc.nextLine();
   }
  }
}
