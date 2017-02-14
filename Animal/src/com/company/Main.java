package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Animal a = new Cat();
        a.MakeSound();
        Animal b = new Dog();
        b.MakeSound();
        //
        Animal c = new Poodle();
        c.MakeSound();
        //המרה אומרים למחשב סמוך עלי
        //כרגע לשתיהם יש את אותה כתובת
        Poodle p = (Poodle) c;
        //דונלנד קסט המרה ללמטה downCAst
        Animal d = c;//upcast המרה הפוכה  implicit cast-באופן מרומז
        //לקחתי את החיה ועשיתי אותה חתולה
        Cat s = (Cat) a;
        //  אא להפוך כלב לחתול בעיה
        //  Cat f=(Cat)d ;
        s.howl();
        p.roll();
        if (a instanceof Poodle) {
            Poodle p2 = (Poodle) a;
        }

    }
}
