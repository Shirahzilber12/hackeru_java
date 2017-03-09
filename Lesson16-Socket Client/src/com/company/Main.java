package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Main {
    final static int PORT = 3000;

    public static void main(String[] args) {
	/*try {
        Socket socket = new Socket("127.0.0.1",PORT);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hi server".getBytes());
        byte[] buffer = new byte[1024];
        int actuallyRead=inputStream.read(buffer  );
        String responsFromServer = new String(buffer,0,actuallyRead);
        System.out.println(responsFromServer);
        inputStream.close();
        outputStream.close();
        socket.close();
    } catch (IOException e) {
        e.printStackTrace();
    }*/
        try {
            Socket socket = new Socket("127.0.0.1", PORT);
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();
            Scanner scanner = new Scanner(System.in);
            byte[] buffer = new byte[9];
            byte[] bufferInt = new byte[4];
            int i = 2;
            int[] arr = new int[2];

            System.out.println("please enter operator");
            // byte[] operator_arr =new byte[1] ;
            String s =  scanner.next();
            char operator = s.charAt(0);
            while((operator!='+')&&( operator!= '-') && (operator!= '*')&& (operator!= '%')&& (operator!= '/'))
            {
                System.out.println("you not enter operator, please enter again");
                s =  scanner.next();
                operator = s.charAt(0);
            }


            while (i > 0){
                System.out.println("please enter number");
                try {
                    Scanner scanner1 = new Scanner(System.in);
                    arr[arr.length-i] = scanner1.nextInt();
                    i--;
                    if ((i==0)&&(arr[1]== 0)) {
                        if ((operator == '/')||(operator == '%'))
                        {
                            System.out.println("not zero");
                            i++;
                        }
                    }
                    /*ByteBuffer.wrap(buffer).putInt(num);
                    outputStream.write(buffer);*/
                }catch (Exception e){
                    System.out.println("no num, enter again");
                }
            }

            ByteBuffer.wrap(buffer).putInt(arr[0]);
            ByteBuffer.wrap(buffer,4,4).putInt(arr[1]);
            ByteBuffer.wrap(buffer,8,1).putInt(operator);
            outputStream.write(buffer);


            System.out.println("your result:");
            inputStream.read(bufferInt);
            System.out.println( ByteBuffer.wrap(buffer).getInt());
            inputStream.close();
            outputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
             } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
