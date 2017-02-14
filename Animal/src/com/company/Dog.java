package com.company;

/**
 * Created by hackeru on 2/6/2017.
 */
public class Dog extends Animal {

    public void bark() {
        System.out.println("dog");
    }

    @Override
    public void MakeSound() {
        bark();
    }
}