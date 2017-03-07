package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {2, 7, 15, 6, 4, 15, 2, 1, 1, 1};
        findMax(arr);
        int max=Integer.MIN_VALUE;
        long before = System.nanoTime();
        for (int i = 0; i <arr.length ; i++) {
            if(max<arr[i])
            max=arr[i];

        }
        long after = System.nanoTime();
        System.out.println("nano time"+(after - before));
       // System.out.print(max);
    }


    public static void findMax(int[] arr) {


        class FindMaxListener implements FindMax.FoundListener {
            boolean f = false;
            int maxNum;
            FindMax thread1, thread2;



            @Override
            public void found(int num) {
                if (!f) {
                    f = true;
                    this.maxNum = num;


                } else {
                    if (num > this.maxNum)
                        this.maxNum = num;
                    System.out.println("max "+this.maxNum);

                }
            }
        }
        FindMaxListener listener = new FindMaxListener();

        int middle =(arr.length-1);
        FindMax searchThread1 =
                new FindMax(arr, 0, middle,  listener);
        FindMax searchThread2 =
                new FindMax(arr, middle,arr.length-1, listener);

        searchThread1.start();
        searchThread2.start();
    }
}


