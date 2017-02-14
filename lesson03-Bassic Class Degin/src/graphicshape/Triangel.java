package graphicshape;

import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/7/2017.
 */
public class Triangel extends Shape {
    private Point p1,p2,p3;
//משולש
    public Triangel(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        Segment seg1=new Segment(p1,p2);
        Segment seg2=new Segment(p2,p3);
        Segment seg3=new Segment(p3,p1);
        if (seg1.getlangth()+seg2.getlangth()<=seg3.getlangth()||seg2.getlangth()+seg3.getlangth()<=seg1.getlangth())
        {
            throw new InvalidParameterException("not a triangle");
        }

    }

    @Override
    public double area() {
        Segment seg1=new Segment(p1,p2);
        //בסיס *גובה לחלק ל2
        return seg1.distanceToPoint(p3)*seg1.getlangth()/2;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
    }
}

