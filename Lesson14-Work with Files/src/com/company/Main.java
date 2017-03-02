package com.company;

import java.awt.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //מצפה לנתיב -סטרינג
        makeFile();

        File file = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\shira kostantiner\\MyFile.txt");

        //System.out.println(file.exists());
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(file);
            //כתיבה לקובץ
            outputStream.write("shira".getBytes());
            outputStream.write("s".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] buffer = new byte[4];
            /*int actullyRead=inputStream.read(buffer);
            if (actullyRead!=-1){
                String s=new String(buffer,0,actullyRead);
                System.out.println(s);
            }*/
            int actullyRead;
            StringBuilder stringBuilder = new StringBuilder();
            while ((actullyRead = inputStream.read(buffer)) != -1) {
                stringBuilder.append(
                        new String(buffer, 0, actullyRead));
            }
            System.out.println(stringBuilder.toString());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static void makeFile() {
        File file = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\shira kostantiner\\MyFile2.txt");
        OutputStream outputStream = null;
        byte[] aBytes = new byte[4];
        try {
            //יוצרת אוביקט מסוג אאוטפט שטרים שיוכל לכתוב לפייל
            outputStream = new FileOutputStream(file);
            Random random = new Random(System.currentTimeMillis());
            int randomSize = random.nextInt(100000)+100000;
            for (int i = 0; i < randomSize; i++) {
                int randomize = random.nextInt(100000) + 100000;
                ByteBuffer.wrap(aBytes).putInt(randomize);
                outputStream.write(randomize);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null)
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        System.out.println(maxInt(file));

    }


    public static int maxInt(File file) {
        byte[] buffer = new byte[4];
        int b;
        int actullyRead;
        int max = 0;
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            //input strem.read=מכניסה לתוך הבאפר ומחזירה לאינט כמה קראה
            while ((actullyRead = inputStream.read(buffer)) != -1) {
                b = ByteBuffer.wrap(buffer).getInt();
                if (b > max)
                    max = b;
            }
            return max;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

        //לכתוב פןנקציה סטטית ויוד שלא מקבלת פרמטרים שיוצרת קובץ במחשב שלי במקום לכתוב בו סטרינג לכתוב בו אינטים הפונקציה תכתוב לקובץ כמות אקראים וגדולה של אינטים והאינטים עצמם הם מספרים אקראים בין 100 אלף ל200 אלף
        //פונקציה סטטית שתקר את הקובץ ותחזיר אינט למס הכי גדול בקובץ
        //הפונקציה תקבל פרמטר ק ותצטרך להחזיר מערך של ק האיברים הכי גדולים בקובץ
        // פונקציה שמקבלת סטרינג וכותבת אותה לקובץ
        return -1;
    }

    public static void reversText(List list){


    }

}