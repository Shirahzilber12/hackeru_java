package graphicshape;

/**
 * Created by hackeru on 2/5/2017.
 */
//abstract  מבטיחה שלא יהיהצ אפשר ליצור משתנים מסוג סאפא
    //abstract =הפשטה ,
public abstract class Shape {
    public void refresh()
    {
        System.out.println("refresh");
    }
    //כל מי שיורש מ shape חייב שיהיה לו מימוש לפונקציות האבסטרקטיות .
    //מחזיר 0 כי חיביים להחזיר ערך  אבל לאפס אים באמת משמעות ולכן צריך לדאוג שאף אחד לא ישתמש בה
   // public double area() {return 0;}
    public abstract double area();
    //public double perimeter() {return 0;}
    public abstract double perimeter();

}