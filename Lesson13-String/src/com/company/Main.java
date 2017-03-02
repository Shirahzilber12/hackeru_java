package com.company;

public class Main {

    public static void main(String[] args) {
        //טרי וכאטש מאפשר לי שלא כל התוכנית תקרוס אלה רק אותו קטע קוד וגם יכול להדפיס הודעת שגיאה
        System.out.println(stam());
        try {
            int[] arr=new int[3];
            arr[15]=90;
            System.out.println("try again");
            Animal animal=new Cat();
            //אחרי זרקית שגאיה אא לכתוב
           // throw new ClassCastException();

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
            System.out.println("there was an error");
        }catch (ClassCastException ex){
            System.out.println("there was error");
        }finally {
            System.out.println("is finally");
        }
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 15
        //שגיאת זמן ריצה
        System.out.println("done");

    }
    //פינאלי יעשה תמיד גם במקרה זה שיש ריטרון שמוציא אותי מהפונקציה עדין יעבור דרך הפינאלי בד"כ יהיה שמה סגירת משאבים (נלמד בהמשך פעולה מאוד חשובה שחיבים שתקרה )
    public static int stam(){
        try {
            int x=9;
            x++;
            return x;
        }
        catch(Exception ex) {
        }
        finally {
            System.out.println("finally");
        }
        return 19;
    }



}
class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}

