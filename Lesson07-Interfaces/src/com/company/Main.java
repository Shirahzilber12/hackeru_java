package com.company;

import java.util.Objects;

public class Main {


    public static void main(String[] args) {
  /*      Shape shape = new Cylinder();
        Rollable rollable = new Ball();
        rollable.roll(13);
        Drawable[] drawables;
        Point[] points= {
                new Point(3, 4),
                new Point(2, 2)
        };
        bubbleSort(points);
        for (int i = 0; i <points.length ; i++) {
            System.out.println(points[i]);

        }

    }


    static void bubbleSort(Comparable[] arr) {
        int upTo = arr.length - 1;
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < upTo; i++) {
                if (arr[i].compareTo(arr[i + 1]) > 0) {
                    Comparable temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSorted = false;
                }
            }
            upTo--;
        }
    }*/
        MotionSenor senor = new MotionSenor();
        Siren siren = new Siren();


        Button btnLogin = new Button();

       // int[] arr = {8, 2, 3, 12, 45, 78};
        List list =new ArrayList();
        list.add(4);
        list.add(8);
        list.add(9);
        System.out.println(list);

    }


    interface Rollable {
        void roll(float degree);
    }

    interface Drawable {
        void draw(boolean[][] canvas);
    }

    class Ball implements Rollable {
        @Override
        public void roll(float degree) {

        }

        void bones() {
        }
    }

    class Shape implements Drawable {

        @Override
        public void draw(boolean[][] canvas) {

        }
    }

    class Circle implements Drawable, Rollable {
        @Override
        public void roll(float degree) {

        }

        @Override
        public void draw(boolean[][] canvas) {

        }
    }

    //לא ממש את דראבל כי שאפ עושה את זה
    class Cylinder extends Shape implements Rollable {
        @Override
        public void roll(float degree) {

        }
    }

    interface Edible {
        void eat(String food);
    }

    interface Comparable {
        int compareTo(Object o);

    }
}


