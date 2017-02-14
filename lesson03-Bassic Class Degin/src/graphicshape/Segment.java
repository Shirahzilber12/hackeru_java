package graphicshape;

import sun.security.util.Length;

/**
 * Created by hackeru on 2/7/2017.
 */
public class Segment {
    private Point p1,p2;
    private double length;
    private boolean is;



    //בנאי
    public Segment(Point p1, Point p2) {
        setP1(p1);
        setP2(p2);

    }

    public void setP1(Point p1) {

        this.p1 = new Point(p1);
        is=false;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
        is=false;
    }

    public Point getP1() {
        return new Point                                                                                                                                                            (p1);
    }

    public Point getP2() {
        return p2;
    }
    //אפשר לגשת לשדה שהוא PRIVATE והוא נעשה כשה ששמרנו בשדה שהוא פריבט יש למשו מחלקה
    //נוסחא למציאת מרחק בן 2 נקודות
    public void calculateLength()
    {
        int deltaY=p1.getY()-p2.getY();
        int deltaX=p1.getX()-p2.getX();
        length= Math.sqrt(deltaX*deltaX+deltaY*deltaY);
        is=true;
    }
    //מציאת שיפוע
    public double slope()
    {
        int deltaY=p1.getY()-p2.getY();
        int deltaX=p1.getX()-p2.getX();
        if (deltaX==0)
            return Double.MAX_VALUE;
        return deltaY/deltaX;

    }
    //
    public double getlangth()
    {
       if(!is)
           calculateLength();
       return length;
    }
    //y=mx+n;

    /**
     * the line that goes through="ערך" the two point p1, p2
     * that determine="לקבוע" this segment can be represented="מיוצג"
     * as Ax +By +C=0
     * @return  the A of the equation ="משוואה "
     *
     */
    public double A()
    {
        return -1*slope();
    }
    public double B(){
        return 1;
    }
    public double C()
    {
        return slope()*p1.getX()-p1.getY();
    }

    //מרחק נקודה מישר
    public double distanceToPoint (Point point) {
        double A = A();
        double numerator =A*point.getX()+B()*point.getY()+C();
        if(numerator<0)
            numerator*=-1;
        double denominator=Math.sqrt(A*A+B()+B());
//B()*B()*B()==1
        return numerator/denominator;
    }
    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if(obj==this)
            return true;
        if(obj instanceof Segment) {
            Segment other = (Segment) obj;
            //שורה מתחת לא נכונה מכיון שמשוים הPOINT לPOINT
            //return this.p1==other.p1&&this.p2==other.p2||this.p1==other.p2&&this.p2==other.p1;
            return (this.p1.equals(other.p1)&&p2.equals(other.p2)||this.p1.equals(other.p2)&&this.p2.equals(other.p1));
        }
        return false;
    }
}
