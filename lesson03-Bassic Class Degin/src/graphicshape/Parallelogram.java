package graphicshape;

import java.security.AccessControlContext;
import java.security.InvalidParameterException;

/**
 * Created by hackeru on 2/7/2017.
 */
//מקבילית
public class Parallelogram extends Shape {
    private Point p1,p2,p3,p4;

    /**
     * make sure that p1,p2 is equal in length and parallel to p3,p4
     * and p1p3 is parallel p2p4
     * throw exception otherwise
     * @param p1
     * @param p2
     * @param p3
     * @param P4
     */
    public Parallelogram(Point p1,Point p2,Point p3,Point P4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        Segment seg1=new Segment(p1,p2);
        Segment seg2=new Segment(p3,p4);
        if(seg1.slope()!=seg2.slope()||seg1.getlangth()!=seg2.getlangth())
            throw new InvalidParameterException("לא מקבילית ");
        Segment seg3=new Segment(p1,p3);
        Segment seg4=new Segment(p2,p4);
        if(seg3.slope()!=seg4.slope())
            throw new InvalidParameterException("לא מקביל ");

        Point MiddlePoint=new Point((p1.getX()+p2.getX()+p3.getX()+p4.getX())/4,(p1.getY()+p2.getY()+p3.getY()+p4.getY())/4);


    }

    @Override
    public double perimeter() {
        Segment seg1=new Segment(p1,p2);
        Segment seg2=new Segment(p2,p4);
        return 2*(seg1.getlangth()+seg2.getlangth());
    }

    @Override
    public double area() {
        return new Triangel(p1,p2,p3).area()*2;

    }
}
