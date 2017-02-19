package com.company;

import com.company.List;


public class LinkList implements List  {
    private Node anchor;
    private int size;
    private Node last;


    public LinkList() {
        //עוגן
        anchor = new Node(123);
        size=0;
        last=anchor;
    }




    @Override
    public void remove(int index) {
        Node temp;
        Node n=anchor;
        if(index>size||index<0)
            throw new  IndexOutOfBoundsException("ddd") ;
        for (int i = 0; i <index-1 ; i++) {
            n = n.next;
        }
        n.next=n.next.next;
        size--;

    }

    @Override
    public void set(int index, int x) {
        Node n = anchor;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n.value=x;
    }

    @Override
    public int  get(int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("ddd");
        Node n = anchor.next;
        for (int i = 0; i < index ; i++) {
            n = n.next;
        }

        return n.value;
    }

    @Override
    public int indexOf(int x) {
        Node n=anchor.next;
        for (int i = 0; i <=size ; i++) {
            if(n.value==x) {
                return i;
            }
            n=n.next;
        }
        return -1;
    }

    @Override
    public int[] toArray() {
        Node n=anchor;
        int [] arr1=new int [size];
        for (int i = 0; i <size ; i++) {
            arr1[i]=n.value;
            n=n.next;
        }
        return arr1;
    }
<<<<<<< HEAD

    @Override
    public void add(int x, int index) {
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("אא להוסיף ");
        if (index == size) {
            add(x);
            return;
        }

        Node n = anchor;
        for (int i = 0; i < index; i++)
            n = n.next;
        Node temp = new Node(x);
        temp.next = n.next;
        n.next = temp;
        size++;
    }
=======
    //לא נכון !
   @Override
    public void add(int x, int index) {
       if (index > size || index < 0)
           throw new IndexOutOfBoundsException("אא להוסיף ");
       if (index == size) {
           add(x);
           return;
       }

       Node n = anchor;
       for (int i = 0; i < index; i++)
           n = n.next;
       Node temp = new Node(x);
       temp.next = n.next;
       n.next = temp;
       size++;
   }
>>>>>>> origin/master

    @Override
    public void add(int x) {
        Node n = anchor;
        last.next=new Node(x);
        last=last.next;
        size++;
    }


    @Override
    public int size() {
        return size;
    }

    private static class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            next=null;
        }
    }


    @Override
    public String toString() {
        if(size==0)
            return "{}";
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("{");
        Node node=anchor.next;
        for (int i = 0; i <size-1; i++,node=node.next) {
            stringBuilder.append(node.value+",");
        }
        stringBuilder.append(node.value);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
   /* @Override
    public Iterator iterator() {
        current = anchor;
        return this;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public Object next() {
        current = current.next;
        return current.value;
    }*/


    }
class Node{
    private Node node;
    int size;

}