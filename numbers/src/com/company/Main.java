package com.company;

public class Main {

    public static void main(String[] args) {

        int num=158;
        int num1=sumOfDigits(num);
        System.out.println("sum" +" "+num1);

         num=12;
        int num2=maxOfDigit(num);
        System.out.println("max" +" "+num2);

    }
    public static int  sumOfDigits(int num) {
        int numEzer;
        int sum = 0;
        while (num > 0) {
            numEzer = num % 10;
            sum += numEzer;
            num /= 10;
        }
        return sum;
    }

    public static int maxOfDigit(int num){
        int result = 0;
        while (num > 0){
            int max = num % 10;
            num /= 10;

            if(max > result)
                result = max;

        }
        return result;
    }

    public static boolean NumDvid3(int num) {
        while (num > 9) {
            num = sumOfDigits(num);
        }
        if (num == 3 || num == 6 || num == 9)
            return true;
        else
            return false;
    }
    public static int reversNum(int num)
    {
        int result=0;
        while (num!=0) {
            int lastDigit=num%10;
            num/=10;
            result =result *10+lastDigit;
        }
        return result;
    }


}
