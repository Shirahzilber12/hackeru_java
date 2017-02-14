package com.company;

/**
 * Created by hackeru on 2/12/2017.
 */
//local  inner class
//רק כאשר מופעלת המתודה אז נוצרת המחלקה שהמתודה תסתיים ההגדרה של המחלקה תעלם

public class Rectangle {

    int width,height;

    public Rectangle makeMeSqure(){
        class Squre extends Rectangle{
            public Squre(int side){
                this.width=side;
            }
            public int getSide(){
                return this.width;
            }

            // מופעל בפועל מה שיש בפועל! ואת זה יראו מחוץ לפונקציה makeMeSqure
            @Override
            public String toString() {
                return "I am a squa                                                                                                                            re with side"+width;
            }
        }
        Squre s=new Squre(width);
        s.getSide();
        return new Squre(width);
    }


    @Override
    public String toString() {
        return "I am rectangle width:"+width+"height"+height;
    }



}