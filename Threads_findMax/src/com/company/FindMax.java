package com.company;

/**
 * Created by hackeru on 3/7/2017.
 */
public class FindMax extends Thread{
    private int[] arr;
    private int from, to;
    private int max;
    private FoundListener listener;
   // private boolean go = true;

    public FindMax(int[] arr, int from, int to,FoundListener listener) {
        this.arr = arr;
        this.from = from;
        this.to = to;
        this.max = Integer.MIN_VALUE;
        this.listener = listener;
        //this.go = go;
    }
    @Override
    public void run() {
        for (int i = from; i <= to; i++) {

            if(arr[i] > max){
                max = arr[i];

            }
        }
        if(listener != null)
            listener.found(max);
    }

    public interface FoundListener{
        void found(int index);
    }


}
