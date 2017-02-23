package com.company;

/**
 * Created by hackeru on 2/21/2017.
 */

public interface Stack<T> {
    void push(T x);
    T pop();
    T peek();
    boolean isEmpty();

}