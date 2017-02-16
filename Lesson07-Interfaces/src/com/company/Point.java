import java.security.InvalidParameterException;

class Point implements Comparable{
    int x, y;


    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Object o) {
        if(o == null || !(o instanceof Point))
            throw new InvalidParameterException("must send a valid point");
        if(o == this)
            return 0;
        Point other = (Point)o;
        double d1 = this.distanceFromOrigin();
        double d2 = other.distanceFromOrigin();
        if(d1 > d2)
            return 1;
        else if(d1 < d2)
            return -1;
        if(this.x >= 0){
            if(other.x >= 0){
                if(this.y * other.y >= 0) {
                    if (this.y >= other.y)
                        return 1;
                    else
                        return -1;
                }else{
                    if(this.y < 0)
                        return 1;
                    else
                        return -1;
                }
            }else{
                if(this.y >= 0)
                    return -1;
                else
                    return 1;
            }
        }else{
            //same same
        }


        return 0;
    }

    public double distanceFromOrigin(){
        return Math.sqrt(x*x + y*y);
    }
}

