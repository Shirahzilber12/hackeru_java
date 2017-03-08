package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

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
        Socket socket = new Socket("127.0.0.1",PORT);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hi server".getBytes());
        Scanner scanner=new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        byte[] buffer = new byte[4];
        int actuallyRead=inputStream.read(buffer  );
        String responsFromServer = new String(buffer,0,actuallyRead);
        System.out.println(responsFromServer);
        inputStream.close();
        outputStream.close();
        socket.close();
    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
