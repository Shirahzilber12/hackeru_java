package com.company;

/**
 * Created by eladlavi on 08/02/2017.
 */
public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        //בודק על השני
        if(obj == null)
            return false;
        // בודק מצביע לאותה כתובת
        if(obj == this)
            return true;
        //האם הוא סוג של פוינט אם כן דונט קסט כי יש כאן ירידה דונט קסט יכול להיכשל בזמן ריצה כי קומפלציה עובר

        if(obj instanceof Point){
            Point other = (Point)obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }
//מחזירה int שהוא מיצג את האוביקט כאלו הוא int
    //בודק בשיטה הפוכה לפי מה ששונה
    //אם 2 פונטים יש להם את אותו אס קוד אז משווים את האקולס
    //השימוש באס קוד במיוחד עמ לבטל את השימוש באקולס
    //טבלת גיבוי בשביל שפועולת הוצאה יהיו בo)1

    @Override
    public int hashCode() {
        return (7*x)^(11*y)^(53*y);
    }

}