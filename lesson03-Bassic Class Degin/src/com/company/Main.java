package com.company;

import graphicshape.*;
import mypackage.*;
//מביא את כל הקבועים
import static java.lang.Math.*;



public class Main {

    public static void main(String[] args) {

        Point p1=new Point(4,5);
        Point p2=new Point(4,5);
        if(p1==p2)
        {
            System.out.println("שווה");
        }
        System.out.println("לא שווה");

        Circle circle1=new Circle();
        System.out.println((int )circle1.area());
        circle1.fillColor(4,5,6);
        String name="shira";
        HappyBirthday.wish();
        Square s=new Square(5);
        s.setHeight(15);
        System.out.println(s.perimeter());
       // Shape p=new Parallelogram();
        Point s1=new Point3D(4,4,4);
        System.out.println(s1);
    }



}
