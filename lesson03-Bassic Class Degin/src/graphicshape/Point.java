package graphicshape;

import java.util.Objects;

/**
 * Created by hackeru on 2/7/2017.
 */
public class Point {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {

        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y=y;
    }
    //בנאי העתקה
    public Point(Point other)
    {
        this.x=other.x;
        this.y=other.y;
    }
    //שווה ערך לכתןב בMAIN
    //
    @Override
    public String toString() {
        return "("+commaSepareted()+")";
    }
    protected String commaSepareted(){
       return x + "," + y;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(obj==this)
            return true;
        if(obj instanceof Point) {
            Point other = (Point) obj;
            return this.x==other.x&&this.y==other.y;
        }
        return false;
    }
}
