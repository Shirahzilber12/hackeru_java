package com.company;



import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws IOException {

        System.out.println("to sigh up enter 1");
        System.out.println("to log in enter 2");
        System.out.println("to log out enter 3 ");
        System.out.println("to exit  enter 4 ");
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter your select :");
        String select = bufferedReader.readLine();
        switch(select){
            case "1":
                break ;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println();


        }
    }

}

