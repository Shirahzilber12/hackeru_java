package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("תרגיל 1");
        int[] arr1={3,4,5,6,5,4,6};
        printArray(arr1);
        System.out.println(checkArray(arr1));
        System.out.println("תרגיל 2");
        int[]arr2={3,4,5,6,7,6,5,4,3};
        printArray(arr2);
        int b=findIndex(arr2,0,arr2.length-1);
        System.out.println("המיקום של האיבר שהאיברים שלפניו גדולים ממנו ואחריו קטנים ממנו:"+b+ ": "+arr2[b]);
        System.out.println("תרגיל 3");
        int[] arr3 = {21,3,7,1,4,6,5,4,7,8,9,10,12,13,1};
        printArray(arr3);
        zogiFirst(arr3,0,arr3.length-1);
       // ex2(arr3);
        printArray(arr3);
        int[] arr;
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 1000; i++) {
            arr = new int[1 + random.nextInt(100)];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = random.nextInt(1000)-500;
            }
            zogiFirst(arr,0,arr.length-1);
            if(!isEvenFirst(arr)){
                System.out.println("your code is wrong");
                break;
            }
        }
    }
    static boolean isEvenFirst(int[] arr){
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] % 2 == 0){
                if(found)
                    return false;
            }else{
                found = true;
            }
        }
        return true;
    }



    static boolean checkArray(int[] arr){
        boolean flag=false;
        for (int i = 0; i <arr.length-1 ; ) {
            if ((arr[i] < arr[i + 1]) && (flag ==false)) {
                flag = false;
                i++;
            }
            else if (arr[i] > arr[i + 1]) {
                flag = true;
                i++;
            }
            else
                return false;
        }
        return true;
    }
    static int zogiFirst(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] %2==0) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
     /*   i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;*/
        return i;
    }
    static int findIndex(int[] arr, int left, int right){
        if(right >= left){
            int middle = left + (right-left)/2;
            if (((middle==0)||(arr[middle] >arr[middle-1]))&&((middle==right)||(arr[middle]>arr[middle+1])))
                return middle;
            if(arr[middle] < arr[middle+1])
                return findIndex(arr, middle+1, right);
            return findIndex(arr, left, middle-1);
        }
        return -1;
    }


    static void printArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1)
                System.out.print(",");
        }
        System.out.println("}");
    }

    public static void ex2(int[] arr) {
        int temp;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] % 2 != 0) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j--;
            } else {
                i++;
            }

        }
    }

}
