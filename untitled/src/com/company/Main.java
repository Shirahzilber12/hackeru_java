package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*        Queue queue = new Queue();
        for (int i = 1; i < 10; i++) {
            queue.insert(i);
        }
        queue.pop();
        queue.insert(15);
        Node<Integer> h = new Node<>();
        h.value = 1272323;
        Node<String> j;*/
        Point point=new Point(4,5);
        System.out.println(point);
        Queue<Integer> smartQueue=new Queue<>();
        smartQueue.insert(3);
        smartQueue.insert(4);
        smartQueue.insert(45);
        smartQueue.insert(2);
        System.out.println("First insertion");
        smartQueue.printQ();

        smartQueue.pop();
        System.out.println("After one pop");
        smartQueue.printQ();

        System.out.println("After another insert");
        smartQueue.insert(7);
        smartQueue.printQ();

        smartQueue.pop();
        System.out.println("After another pop");
        smartQueue.printQ();


    }
}
