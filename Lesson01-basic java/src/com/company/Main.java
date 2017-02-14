package com.company;

public class Main {

    public static void main(String[] args) {
        int x = 10, y = 3;
        System.out.println("x" + "= " + x + " ," + "y= " + y);
        int mone1 = distance(x, y);
        System.out.println("distance" + "= " + mone1);
        int c1 = product(x, y);
        System.out.println("product" + "= " + c1);
        int result1 = division(x, y);
        System.out.println("division" + "= " + result1);
        int power = power(x, y);
        System.out.println("power" + "= " + power);
        int sqrt = sqrt(x);
        System.out.println("sqrt" + "= " + sqrt);
        int n = 10;
        int n1 = fib(n);
        System.out.println("fib" + "= " + n1);
    }

    static int distance(int x, int y) {
        int biger = 0, mone = 0;
        if (y > x) {
            biger = y;
            y = x;
            x = biger;
        }
        for (int i = y; i < x; i++)
            mone++;
        return (mone);
    }

    //quotient
    static int product(int x, int y) {
        int result = 0;
        while (y > 0) {
            if (y % 2 == 0) {
                //חילוק
                y = y >> 1;
                //כפל
                x = x << 1;
            } else {
                y--;
                result += x;
            }
        }
        return (result);
    }

    static int division(int x, int y) {
        int result = 0;
        if (y == 0)
            return -1;
        int sum = y;
        while (sum <= x) {
            sum += y;
            result++;
        }
        return result;
    }

    static int remainder() {
        int y = 10, x = 3;
        if (y == 0)
            return -1;
        return distance(x, product(division(x, y), y));
    }

    static int power(int x, int y) {
        if (x == 0) {
            if (y == 0)
                return -1;
            return 0;
        }
        if (y == 0 || x == 1)
            return 1;
        //return power(x,y-1)*x;
        if (y % 2 == 0) {
            int temp = power(x, y / 2);
            return temp * temp;
        } else {
            int temp = power(x, y / 2);
            return temp * temp * x;
        }
    }

    static int sqrt(int x) {
        int result = 0;
        while (result * result < x)
            result++;
        return result;

    }
//סדרת פיבונצי
    static int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        int a = 0, b = 1;
        // return fib(n-1)+fib(n-2);
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

        }
        return b;
    }


}