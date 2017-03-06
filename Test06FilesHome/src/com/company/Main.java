
package com.company;

import java.awt.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        File file1=new File("C:\\Users\\This_user\\Desktop\\hackeru\\MyFile.txt");
        File file2=new File("C:\\Users\\This_user\\Desktop\\hackeru\\MyFile.txt2");
        OutputStream outputStream = null;
        try{
            outputStream = new FileOutputStream(file1);
            outputStream.write("how are you".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        makeFile(file2);
        revers(file1);
        addNum();


    }


    private static void makeFile(File file2) {

        OutputStream outputStream=null;
        byte[] bytes=new byte[4];
        try {
            outputStream = new FileOutputStream(file2);
            Random random=new Random(System.currentTimeMillis());
            for (int i = 0; i <2 ; i++) {
                int num=random.nextInt(10)+10;
                ByteBuffer.wrap(bytes).putInt(num);
                //ttyou cant write int only bytes
                outputStream.write(bytes);
            }

    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (outputStream!=null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
            System.out.println(readFile(file2));
    }
    private static int readFile(File file){
        int b=0;
        byte[] buffer=new byte[4];
        int max=Integer.MIN_VALUE;
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int index=0;
        try {
            while ((index=inputStream.read(buffer))!=-1){
                if(index!=4)
                    System.out.println("no num");
                b = ByteBuffer.wrap(buffer).getInt();
                if(b>max)
                    max=b;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (inputStream!=null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return max;
        }
    }


    static void revers(File file){
        File tempFile=new File("C:\\Users\\This_user\\Desktop\\hackeru\\TempFile.txt");
        OutputStream outputStream=null;
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream(file);
            outputStream=new FileOutputStream(tempFile);
            int oneByte=0;
            char[] chars=new char[50];
            int lenghe=0;
            while ((oneByte=inputStream.read())!=-1){
               //byte b=(byte)oneByte;
                char c=(char)oneByte;
                if(c!=' ') {
                    chars[lenghe] = c;
                    lenghe++;
                }
                else{
                    for (int i = lenghe-1; i >= 0; i--) {
                        outputStream.write(chars[i]);
                    }
                    lenghe=0;
                    outputStream.write(' ');
                }
            }
            for (int i = lenghe-1; i >=0 ; i--) {
                outputStream.write(chars[i]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(outputStream!=null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (inputStream!=null)
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
        }
    }

  static void addNum ()
  {
      File file=new File("C:\\Users\\This_user\\Desktop\\hackeru\\addNum.txt");
      OutputStream outputStream=null;
      InputStream inputStream=null;
      try {
          outputStream=new FileOutputStream(file);
          byte[] bytes=new byte[4];
          int[] array =new int[20];
          array[0]=1;
          array[1]=1;
          for (int i = 0; i < 2; i++) {
              ByteBuffer.wrap(bytes).putInt(1);
              outputStream.write(bytes);
          }
          for (int i = 2; i <array.length ; i++) {
              array[i]=array[i-1]+array[i-2];
              ByteBuffer.wrap(bytes).putInt(array[i]);
              outputStream.write(bytes);
          }
          inputStream = new FileInputStream(file);
          int howMuchRead=0;
          while ((howMuchRead=inputStream.read(bytes))!=-1){
              int int1=ByteBuffer.wrap(bytes).getInt();
              System.out.print(int1 +" ");
          }


      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }finally {
          if(outputStream!=null)
          try {
              outputStream.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
          if (inputStream!=null)
              try {
                  inputStream.close();
              } catch (IOException e) {
                  e.printStackTrace();
              }
      }
  }
    static int[] kBiggest(int k) throws FileNotFoundException {
        File filet = new File("C:\\Users\\Raitan\\Desktop\\temp6.txt");
        OutputStream outputStream = null;
        InputStream inputStream = null;
        byte[] buffer=new byte[4];
        try{
            outputStream=new FileOutputStream(filet);
            inputStream=new FileInputStream(filet);
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < 30; i++) {
                int rnd = random.nextInt(50);
                System.out.println(rnd);
                ByteBuffer.wrap(buffer).putInt(rnd);
                outputStream.write(buffer);
            }
            int []arr= new int[k];
            for (int i = 0; i < k;  arr[i++] = 0);
            int actuallyRead;

            while ((actuallyRead=inputStream.read(buffer))!=-1){
                if(actuallyRead!=4)
                    throw new InvalidParameterException();
                int temp=ByteBuffer.wrap(buffer).getInt();
                int min = Integer.MAX_VALUE;
                int pos = 0;
                for (int i = 0; i < k; i++) {
                    if(arr[i]<min){
                        min = arr[i];
                        pos = i;
                    }
                }
                if(min < temp){
                    arr[pos] = temp;
                }
            }
            return arr;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(outputStream != null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return null;
    }




}


