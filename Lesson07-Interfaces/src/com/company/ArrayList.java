package com.company;

/**
 * Created by This_user on 14/02/2017.
 */
public class ArrayList implements List {
    int [] arr;
    int size;

    public ArrayList(int[] arr, int size) {
        this.arr = arr;
        this.size = arr.length;
    }

    public ArrayList() {
        arr=new int [10];
        size=0;
    }

    @Override
    public void add(int x) {
        if (size > arr.length)
            copy();
        arr[size] = x;
        size++;

    }


    @Override
    public void add(int x, int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("לא נכון ");
        copy();
        for (int i = size; i >index ; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = x;
        size++;
    }

    @Override
    public void remove(int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("לא נכון ");
        for (int i = index; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
    }

    @Override
    public void set(int index, int x) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("לא נכון ");
        arr[index]=x;

    }

    @Override
    public int  get(int index) {
        if(index<0||index>=size)
            throw new IndexOutOfBoundsException("לא נכון ");
        return arr[index];
    }

    @Override
    public int indexOf(int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    @Override
    public int[] toArray() {
        int [] temp=new int [size];
        for (int i = 0; i <size ; i++) {
            temp[i]=arr[i];
        }
        return temp;
    }
    private void copy() {
        if (size == arr.length) {
            int[] arr2 = new int[size * 2];
            for (int i = 0; i < arr.length; i++)
                arr2[i] = arr[i];
            this.arr = arr2;
            //return arr2;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (size == 0)
            return "{}";
        String s = "{";
        for (int i = 0; i < size - 1; i++) {
            s += arr[i] + ",";
        }
        s += arr[size - 1];
        s += "}";
        return s;
    }
}

