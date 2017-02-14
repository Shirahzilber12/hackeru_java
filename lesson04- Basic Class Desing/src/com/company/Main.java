package com.company;

public class Main {

    public static void main(String[] args) {
        Dog d = null;//// בגלל שD הוא פויינטר מותר לשים בו נאל אבל כשמריצים תהיה שגיאה לכן אי אפשר להריץ אובייקט על נאל
        handleDog(d);
        System.out.println("end");

        Segment segment = new Segment(new Point(4,5),null);
        segment.setP1(null);
        System.out.println(segment);//אם שדה נאל ואת משרשרת אותו לסרינג אז הוא מתייחס אליו כסטרינג נאל
        //פריטלן מדפיס סטרינג ולכן הוא הולך לטוסטרינג ומדפיס NULL_NULL
        System.out.println(d);//מדפיס נאל בלי ללכת לטוסטרינג בתוך הפונקציה פריטלן הוא שואל אם זה נאל ואז לא הולך לטוסטרינג
        Dog d2= new Dog();
        
    }

    public static void handleDog(Dog d){
        if(d!=null)
           d.bark();
    }

    class Dog{
        void bark(){
            System.out.println("waf...waf...");
        }
    }

    @Override
    public String toString() {
        return "I am a dog";
    }
}
