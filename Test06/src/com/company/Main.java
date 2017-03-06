package com.company;

import java.io.*;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\hackeru_java\\Int.txt");
        makeFile(file);
        System.out.println();
        readFile(file);

        System.out.println();
        try {
            int[] arr = kSmallest(3, file);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File fileString = new File("C:\\Users\\hackeru.HACKERU3\\Documents\\GitHub\\hackeru_java\\String.txt");
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileString);
            outputStream.write("how are you how are you shira".getBytes());
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

        String[] strings = new String[3];
        strings[0] = "shira";
        strings[1] = "you";
        strings[2] = "me";
        System.out.println();
        tar3(fileString, strings);


    }

    static void makeFile(File file2) {
        OutputStream outputStream = null;
        byte[] bytes = new byte[4];
        try {
            outputStream = new FileOutputStream(file2);
            Random random = new Random(System.currentTimeMillis());
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(10) + 10;
                System.out.print(num + " ");
                ByteBuffer.wrap(bytes).putInt(num);
                outputStream.write(bytes);
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
    }

    static int[] kSmallest(int k, File file) throws FileNotFoundException {

        InputStream inputStream = null;
        byte[] buffer = new byte[4];
        int[] arr = new int[k];
        try {
            inputStream = new FileInputStream(file);
            for (int i = 0; i < k; i++) {
                arr[i] = Integer.MAX_VALUE - i;
            }
            int actuallyRead;
            while ((actuallyRead = inputStream.read(buffer)) != -1) {
                if (actuallyRead != 4)
                    throw new InvalidParameterException("no num ");
                int number = ByteBuffer.wrap(buffer).getInt();
                int max = Integer.MIN_VALUE;
                int pos = 0;
                for (int i = 0; i < k; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        pos = i;
                    }
                }
                if (max > number) {
                    arr[pos] = number;
                }
            }

        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

        return arr;

    }

    static void mergeFile(File file1, File file2, File file3) {
        int[] arr1 = readFile(file1);
        int[] arr2 = readFile(file1);
        int[] arr3 = merge1(arr1, arr2);
        OutputStream outputStream = null;
        try {
            byte[] bytes = new byte[4];
            outputStream = new FileOutputStream(file3);
            for (int j = 0; j < arr3.length; j++) {
                int num = arr3[j];
                ByteBuffer.wrap(bytes).putInt(num);
                outputStream.write(bytes);
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

    }

    static int[] readFile(File file) {
        long a = file.length() / 4;
        int b = (int) a;
        int[] arr = new int[b];
        int num = 0;
        int i = 0;
        byte[] buffer = new byte[4];
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int index = 0;
        try {
            while ((index = inputStream.read(buffer)) != -1) {
                if (index != 4)
                    System.out.println("no num");
                num = ByteBuffer.wrap(buffer).getInt();
                arr[i] = num;
                System.out.print(arr[i] + " ");
                i++;

            }

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
        return arr;
    }

    static int[] merge1(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0, j = 0, k = 0; i < arr3.length; i++) {
            if (arr1[j] < arr2[k]) {
                arr3[i] = arr1[j];
                j++;
            } else {
                arr3[i] = arr1[k];
                k++;
            }
        }
        return arr3;
    }

    static void tar3(File fileString, String[] words) {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileString);
            int oneByte = 0;
            int[] num = new int[words.length];
            char[] word = new char[50];
            int length = 0;
            while ((oneByte = inputStream.read()) != -1) {
                char c = (char) oneByte;
                if (c != ' ') {
                    word[length] = c;
                    length++;
                } else {
                    for (int i = 0; i < words.length; i++) {
                        String s = new String(word, 0, length);
                        if (words[i].equals(s)) {
                            num[i]++;
                        }
                    }
                    length = 0;
                }
            }
            for (int i = 0; i < words.length; i++) {
                String s = new String(word, 0, length);
                if (words[i].equals(s)) {
                    num[i]++;
                }
            }

            for (int i = 0; i < words.length; i++) {
                System.out.print("the word  " + words[i] + " is " + num[i] + " times ");
                System.out.println();
            }


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

    static void tar4(File file) {
        Random random = new Random(System.currentTimeMillis());
        int numberOfIntegers = random.nextInt(Integer.MAX_VALUE);

    }
}
