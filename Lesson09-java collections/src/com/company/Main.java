package com.company;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 1; i < 4; i++) {
            queue.insert(i);
        }
        queue.pop();
        queue.insert(15);
        printQ(queue);
    }
    public static void printQ(Queue t){
        while(!t.isEmpty()) {
            System.out.print(t.pop()+" ");;
        }
    }
}
