package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;

/**
 * Created by hackeru on 3/8/2017.
 */
public class ClientThread extends Thread {
    Socket clientSocket;
    InputStream inputStream;
    OutputStream outputStream;
    public ClientThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

 /*   @Override
    public void run() {
        try {
            inputStream = clientSocket.getInputStream();
            outputStream = clientSocket.getOutputStream();
            byte[] buffer = new byte[1024];
            int actuallyRead = inputStream.read(buffer);
            String messageFromClient =
                    new String(buffer,0,actuallyRead);
            System.out.println(messageFromClient);
            outputStream.write("thank you client".getBytes());






        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (outputStream!=null)
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                if (clientSocket!=null)
                    try {
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        }
    }*/
   public void run() {
        try {
            inputStream = clientSocket.getInputStream();
            outputStream = clientSocket.getOutputStream();
            byte[] buffer = new byte[9];
            byte[] bufferInt = new byte[4];
            int sum = 0;
            inputStream.read(buffer);
            int num1 = ByteBuffer.wrap(buffer).getInt();
           System.out.println(num1);

            int num2 = ByteBuffer.wrap(buffer,4,4).getInt();
            System.out.println(num2);
            char operator = (char)buffer[9];
           switch (operator){
               case '+':
                    sum = sum(num1,num2);
                   break;
               case '-':
                    sum = subtraction(num1,num2);
                   break;
               case '*':
                    sum = mult(num1,num2);
                   break;
               case '/':
                   sum = divide(num1,num2);

                   break;
               case '%':
                   sum = mode(num1,num2);
                   break;


           }

            ByteBuffer.wrap(buffer).putInt(sum);
            outputStream.write(bufferInt);






        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (outputStream!=null)
                    try {
                        outputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                if (clientSocket!=null)
                    try {
                        clientSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        }
    }
    private int sum(int num1 ,int num2){
       return num1+num2;
    }
    private int subtraction(int num1 ,int num2){
        return num1-num2;
    }
    private int divide(int num1 ,int num2){
        if(num1==0)
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return num1/num2;
    }
    private int mode(int num1 ,int num2){
        if(num1==0)
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return num1%num2;
    }
    private int mult(int num1 ,int num2){
        return num1*num2;
    }
}
