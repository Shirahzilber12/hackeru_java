package com.company;


public interface List {
    void add(int x);
    void add(int x,int index);
    void remove(int index);
    void set(int index,int x);
    int  get (int x);

    /**
     * in
     * @param x האיבר שאנחנו מחפשות
     * @return
     */
    int indexOf(int x);
    int [] toArray();
    int size();
}
