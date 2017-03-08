package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Exchanger;
import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
	    Map<String,String>users = new HashMap<>();
        String userName = "shira";
        String password = "0527659189";
    }
}
class MyInteger{
    int x;
        }
class PersonThread extends Thread{
    private Semaphore machines;
    private String name;

    public PersonThread(Semaphore machines, String name) {
        this.machines = machines;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"wating to ATM machines");
        //
        try {
            machines.acquire();
            System.out.println("ddddddddd");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class FirstThread extends Thread{
    private Exchanger<String> sillyTalk;

    public FirstThread(Exchanger<String> sillyTalk) {
        this.sillyTalk = sillyTalk;
        start();
    }

    @Override
    public void run() {
        String reply = null;
        try {
            reply = sillyTalk.exchange("knock ");
            System.out.println("second thread  "+ reply);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
 class SecondThread extends Thread{
    private Exchanger<String> sillyTalk;

     public SecondThread(Exchanger<String> sillyTalk) {
         this.sillyTalk = sillyTalk;
         start();
     }

     @Override
     public void run() {
         String reply = null;
         try {
             reply = sillyTalk.exchange("מי שם  ");
             System.out.println("שחקן ראשון   "+ reply);
             reply = sillyTalk.exchange("שחקן שני עונה בשאלה");
             System.out.println("");
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }
 }