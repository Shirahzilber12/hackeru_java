
package com.company;


public class Queue {
    int[] arr;
    int front, rear;
    int size;

    public Queue() {
        arr = new int[4];
        front = 0;
        rear = arr.length-1;
        size=0;
    }
    public int getSize(){

    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size==arr.length;
    }

    public void insert(int x){
        if(isFull())
            throw new IndexOutOfBoundsException("יותר מדי אברים ");
        rear = (rear +1)% arr.length ;
        arr[rear] = x;
        size++;
        //System.out.print(arr[rear]+" ");
    }

    public int pop(){
        if(isEmpty())
            throw new IndexOutOfBoundsException();
        int x = arr[front];
        front = (front % arr.length) + 1;
        return x;
    }


}