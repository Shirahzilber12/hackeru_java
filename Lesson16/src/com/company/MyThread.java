package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hackeru on 3/8/2017.
 */
public class MyThread extends Thread{
    String userName,password;
    Map<String,String> users;
    MyInteger myInteger;

    public MyThread(String userName, String password, HashMap<String, String> users,MyInteger myInteger) {
        this.userName = userName;
        this.password = password;
        this.users = users;
        this.myInteger = myInteger;
    }

    @Override
    public void run() {
        boolean success = false;
        synchronized (users){
       if(!users.containsKey(userName)) {
           users.put(userName, password);
           success = true;
       }
       if(success){}


       }
    }
}
