package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random=new Random(9);
        for (int i = 0; i < 4; i++) {
            System.out.println(random.nextInt()+",");
        }
        int [] arr1={9,0,3,4,2,5,8};
	sort1(arr1);
	int place=partition(arr1,5,5);
    }
    static void sort1(int[]arr1) {
        int ezer = 0;
        int upTo = arr1.length;
        boolean degel=false;
        while (!degel) {
            degel=true;
            for (int i = 0; i < upTo-1; i++)
            {
                if (arr1[i] > arr1[i + 1])
                    degel=false;
                    ezer = arr1[i];
                    arr1[i] = arr1[i + 1];
                    arr1[i + 1] = ezer;
                upTo--;
            }

        }
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

    }
    //התוצאה של הפונקציה מחזירה את המיקום של הpiovot שהוא המס שנמצא במקום הנכון שלו .
    static int partition (int [] arr,int low ,int high)
    {
        int pivot= arr[high];
        int i=low-1;
        for (int j = 0; j <high ; j++) {
            if (arr[j]<=pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            i++;
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;
        }
        return 1;
    }

    static  void quickSort (int[] arr, int low, int high)
    {
        if (low < high)
        {
            int p=partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }
    static  int  quickSort1 (int[] arr, int low, int high,int k) {
        if (low < high) {
            int p = partition(arr, low, high);
            if (p == k) {
                return (arr[p]);
                if (p < k)
                    return quickSort1(arr, low, p - 1, k);
                else
                    return quickSort1(arr, p + 1, high, k - p + low - 1);
            }
            return -1;
        }

    }








