package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[]{7, 3, 88, 4, 9, 12, 56};
        int numOfStudent = 3;

        printArray(arr);
        A(arr, numOfStudent);
        int a = 4, b = 3;
        int[][] arr2 = {{4, 6, 7, 9}, {5, 8, 9, 10}, {6, 9, 10, 12}};
       boolean c= B(arr2,56);
        System.out.println(c);

    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    static void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(",");
        }
        System.out.println("}");
    }

    static int  A(int[] arr, int numOfStudent) {
        if(numOfStudent==0||arr.length==0)
            return 0;
        if (arr.length<numOfStudent)
            return -1;
        quickSort(arr, 0, arr.length - 1);
        int num = numOfStudent - 1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - num; i++) {
            if (min > (arr[i + num] - arr[i]))
                min = arr[i + num] - arr[i];
            i++;
        }
        System.out.println(min);
return min;
    }

    //אבריו שמערכיו מערכים
    static boolean B(int[][] arr2, int x) {
        int n = arr2.length;
        int i = 0;
        int j = n - 1;

        while (i < n && j >= 0) {
            if(n!= arr2.length)
                System.out.println("");
            if (arr2[i][j] == x)
                return true;
            if (arr2[i][j] > x)
                j--;
            else
                i++;
        }
        return false;
    }
}

