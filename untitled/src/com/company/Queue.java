package com.company;


public class Queue<T> {
    Node<T> head, tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public boolean isEmpty(){return head == null;}

    public void insert(T x){
        if(isEmpty()) {
            tail = new Node<T>(null, x, null);
            head = tail;
            return;
        }
        Node<T> toAdd=new Node<T>(null,x,tail);
        tail.next=toAdd;
        tail=tail.next;
    }
    public T pop() {
        if (isEmpty())
            throw new IndexOutOfBoundsException();
        T res = head.value;
        if (head.next != null) {
            head.next.previous = null;
        }
        head = head.next;
        return res;
    }
    public void printQ (){
        Node<T> temp=head;
        while(temp!=null){
            System.out.print(temp.value+"  ");
            temp=temp.next;
        }
        System.out.println();
    }
    public boolean isFull(){
        return false;
    }

/*    public boolean isFull(){
       if(tail % arr.length == head && (tail != 0))
           return true;
       return false;
    }*/
}