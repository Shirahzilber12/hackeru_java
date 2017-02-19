package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final byte ASCII_9 =57 ;
    private static final byte ASCII_0 =48 ;

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter :");
        String a = bufferedReader.readLine();
        System.out.println(isInt(a));
        toInt(a);
    }

    public static boolean isInt(String num) {
        if (num == null || num.length() == 0)
            return false;
        byte[] numByte = num.getBytes();
        int length = numByte.length;
        int i=0,sign;
        if (numByte[0] == 45) {
            i = 1;
            //sign = -1;
        }
        for (; i < length; ) {
            if ((numByte[i] >= ASCII_0) && (numByte[i] <= ASCII_9))
                i++;
            else
                return false;
        }
        return true;
    }

    public static void toInt(String a) {
        byte[] numByte = a.getBytes();
        int sum = 0;
        int length = numByte.length;
        int i=0,sign=1;
        if (numByte[0] == 45) {
            i = 1;
            sign = -1;
        }
        for (; i < length; i++) {
            // char c = (char) sBytes[i];
            sum = sum * 10 + (numByte[i] - 48);
        }
        System.out.println(sum*sign);
    }
}





