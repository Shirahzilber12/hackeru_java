package com.company;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        Number [] nums={5,7,4.3f,new Double(3), new RationalNumber(5,2)};
        System.out.println(sum(nums));
    }
    static boolean containsPairWithSumX2 (int [] arr, int sum){ //runtime 0(n)
        //this only works if we have numerator number range (max-min) that is workable.
        //better runtime vs bad memory usage --> so we mix* both:

        //*add: if (arr.length<100) return containsPairWithSumX(arr,sum);
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]>max)
                max=arr[i];
            if(arr[i]<min)
                min=arr[i];
        }
        //*add: if (max-min>1000) return containsPairWithSumX(arr,sum);
        boolean[] binmap = new boolean[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            int temp = sum - arr[i]; //complement
            if (temp >= min && binmap[temp - min]) return true;
            binmap[arr[i] - min] = true;
        }
        return false;
    }
    //CLASSES & OVERLOADING

    //יש לנו כאן מערך של NUMBERS וכיוון שלכל אחד יש את DOUBLEVALUE ניתן לחשב סכום של כולם
    public static double sum (Number[] nums)
    { //כל מחלקה שמייצגת טיפוס מספרי יורשת מNUMBERS
        double sum=0.0;
        for (int i = 0; i < nums.length; i++) {
            Number num=nums[i];
            sum+=num.doubleValue();//returns double value of given number
        }
        return sum;
    }
}
class RationalNumber extends Number
{
    int numerator;//mone
    int denominator;//machane
    //EX1 add method that gets another fraction and adds it to current fraction
    //Ex2 simplify fraction
    //בנאי
    public RationalNumber()
{
    this(0,1);
}
    public RationalNumber(int numerator) {
        this(numerator,1);
    }
    RationalNumber(int numerator, int denominator)
    {
        if(denominator == 0) throw new InvalidParameterException("Division by zero!");
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void simplify ()
    {
        if(numerator%denominator == 0)
        {
            numerator=denominator/numerator;
            denominator=1;
        }
        else
        {
            int num=gcd(numerator,denominator);
            numerator/=num;
            denominator/=num;
        }
    }
    //מוצא את המכנה המשותף הגדול ביותר
    public int gcd(int x, int y){
        if(x==0)
            return y;
        return gcd(y%x,x);
    }
    //חיבור 2 מספרים
    public void add(RationalNumber num)
    {
        int newDenominator=gcd(this.denominator, num.denominator);
        int a=this.denominator;
        int b=num.denominator;
        this.denominator*=b;
        this.numerator*=b;
        this.numerator+=numerator*a;
        reduch();

    }
    public void reduch(){
        int gcd =gcd(this.denominator,this .numerator);
        this.denominator/=gcd;
        this.numerator/=gcd;
    }






    @Override
    public int intValue() {// not exact but this is the conversion
        return numerator/denominator;
    }
    @Override
    public long longValue() {
        return intValue();
    }
    @Override
    public float floatValue() {
        return (float)numerator/denominator;
        /*Note: return (float)(numerator/denominator) will not work because we
          are making the division result - which is int - a float*/
    }
    @Override
    public double doubleValue() {
        return floatValue();
    }
}
