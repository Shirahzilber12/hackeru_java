package com.company;

import java.security.InvalidParameterException;
import java.util.Objects;


public class Point implements Comparable{
    private int x, y;


    @Override
    public int compareTo(Object o) {
        if (o == null || !(o instanceof Point))
            throw new InvalidParameterException("send valid point");
        if (o == this) return 0;
        Point point = (Point) o;
        double d1 = this.distanceFromOrigin();
        double d2 = point.distanceFromOrigin();
        if (d1 > d2)
            return 1;
        else if (d1 < d2)
            return -1;
        if (x >= 0) {
            if (point.x >= 0)
                if (y >= 0)
                    if (point.y * point.y >= 0) {
                        if (y >= point.y)
                            return 1;
                        else
                            return -1;
                    } else {
                        if (y < 0)
                            return 1;
                        else
                            return -1;
                    }
            if (this.y >= 0)
                return -1;
            else
                return 1;
        }
        else{
            if (y >= 0)
                if (point.y * point.y >= 0) {
                    if (y >= point.y)
                        return 1;
                    else
                        return -1;
                } else {
                    if (y < 0)
                        return 1;
                    else
                        return -1;
                }
            if (this.y >= 0)
                return -1;
            else
                return 1;
        }
    }

    double distanceFromOrigin(){
        return Math.sqrt(x*x+y*y);
    }
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
        if(obj == null)
            return false;
        if(obj == this)
            return true;
        if(obj instanceof Point){
            Point other = (Point)obj;
            return this.x == other.x && this.y == other.y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (7 * x) ^ (11 * y) ^ (53 * y);
    }


}

