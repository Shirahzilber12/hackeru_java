package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

import static com.company.User.checkingPassWord;
import static com.company.User.checkingUsername;

public class Main {
    //הקצאת מערך
   static List<User> users=new ArrayList<>();
    //מי מחובר
    static User loggedInUser;

    public static void main(String[] args) throws IOException {
        users=new ArrayList<>();
        loggedInUser=null;


    }
    public static void printMenu() {
        System.out.println();
        System.out.println("please choose:");
        System.out.println("to sigh up press 1");
        System.out.println("to log in press 2");
        System.out.println("to log out press 3 ");
        System.out.println("to revers string press 4");
        System.out.println("to exit  enter 0 ");
        System.out.print("your choice:");
        try {
            int nextByte = System.in.read();
            //לא רלונטי לתרגיל הזה
            if (nextByte == -1)
                throw new InvalidParameterException("input error");
            char select = (char) nextByte;
            switch (select) {
                case '1':
                    signup();
                    break;
                case '2':
                    login();
                    break;
                case '3':
                    logOut();
                    break;
                case '4':
                    reversString();
                    break;
                case '0':
                    System.out.println("bye bye");
                    break;

                default:
                    System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        printMenu();
    }


    public static String readInput(){
        String input=null;
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        try {
             input=bufferedReader.readLine();
            return readInput();
            }
        catch (IOException e) {
            e.printStackTrace();
        }
        return input;

    }

     static void signup(){
        String user=readInput();
     };
     static void login(){}
     static void logOut(){}
     static void exit(){}
     static void reversString(){}



}

