package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

   static void search(int[] arr, int num) {

        //local inner class
        class SearchFoundListener implements SearchThread{

        SearchThread.FoundListener listener = new SearchThread.FoundListener() {

            boolean f=false;
            int index;

            @Override
            public void found(int index) {
                if (!f){
                    f=true;
                    if (index==-1){
                        this.index = -1;

                    }else {
                        System.out.println("found at " + index);
                        this.index=index;
                    }
                }else {
                    if (index==-1){
                        if (this.index==-1){
                            System.out.println("not found");
                        }else {

                        }
                    }
                    else {
                        if (this.index==-1){
                            System.out.println("found at "+index);
                        }
                    }
                }
            }
        };
        int n = arr.length - 1;
        SearchThread searchThread1 = new SearchThread(arr, 0, n / 2, num, listener);
        SearchThread searchThread2 = new SearchThread(arr, n / 2 + 1, n, num, listener);
        searchThread1.start();
        searchThread2.start();
    }
}
