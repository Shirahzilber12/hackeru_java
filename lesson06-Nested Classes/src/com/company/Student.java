package com.company;
//HMHR, YHPU
enum Gender{
    MALE,FEMALE,OTHER;
}

public class Student {
    //STATIC =שייך למחלקה
    //קבועים זה אתיות גדולות
    public static final int KFAR_SAVA = 43;
    public static final int RANANA = 53;
    public static final int JERUSALEM = 43;
    public static final int MARRIED=43;
    public static final int SINGLE=43;
    String firstName;
    String lastName;
    int cityId;
    Gender gender;

 }
 //עצם השמה זה יצירת אוביקט
   enum PrintType {
       DOTMATRIX(2,"dotmatrix"), M2(1,"m1"), M3(2,"m3"), M4(7,"m3");
       private int pageCapacity;
       String name;

       private PrintType(int pageCapacity,String name) {
           this.pageCapacity = pageCapacity;
           System.out.println("*");
       }

       public int getPageCapacity() {
           return pageCapacity;
       }

     @Override
     public String toString() {
         return name;
     }
 }
