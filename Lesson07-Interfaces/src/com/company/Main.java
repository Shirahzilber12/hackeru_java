package com.company;

import java.security.InvalidParameterException;

public class Main {

    public static void main(String[] args) {
	    /*Shape shape = new Cylinder();
	    Rollable rollable = new Ball();
	    rollable.roll(13);
	    Drawable[] drawables;
	    Point[] myPoint = {
                new Point(98, 22),
	            new Point(4, 5),
                new Point(2, 7),
                new Point(7, 2)
        };
	    bubbleSort(myPoint);
        for (int i = 0; i < myPoint.length; i++) {
            System.out.print(myPoint[i]);
        }*/

//
	    /*MotionSensor sensor = new MotionSensor();
	    //Siren siren = new Siren();
	    //sensor.setListener(siren);
        Police police = new Police();
        sensor.setListener(police);
	    sensor.detectMotion();
	    Button btnLogin = new Button();
	    btnLogin.setListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button clicked");
            }
        });*/
	    Dog myDog=Dog.getDog();
	    myDog.setName("ggg");
	    Dog dog2=Dog.getDog();
        System.out.println(dog2.getName());

        LinkList list = new LinkList();
        list.add(45);
        list.add(76);
        list.add(15);
        //list.remove(2);
        //System.out.println(list);

        //int max = list.get(0);
       /* for(Object i : list){
            Integer x = (Integer)i;
            System.out.println(x);
        }

        list.iterator();
        while(list.hasNext()){
            Integer x = (Integer) list.next();
            System.out.println(x);
        }*/


    }

    static void bubbleSort(Comparable[] arr){
        int upTo = arr.length-1;
        boolean isSorted = false;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i < upTo; i++) {
                if(arr[i].compareTo(arr[i+1]) > 0){
                    Comparable temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    isSorted = false;
                }
            }
            upTo--;
        }
    }
}
interface Rollable{
    void roll(float degree);
}

interface Drawable{
    void draw(boolean[][] canvas);
}
class Ball implements Rollable{

    void bounce(){

    }
    @Override
    public void roll(float degree) {

    }
}
class Shape implements Drawable{

    @Override
    public void draw(boolean[][] canvas) {

    }
}
class Circle implements Drawable, Rollable{

    @Override
    public void roll(float degree) {

    }

    @Override
    public void draw(boolean[][] canvas) {

    }
}
class Cylinder extends Shape implements Rollable{

    @Override
    public void roll(float degree) {

    }
}
interface Edible{
    void eat(String food);
}




/*class MotionSensor{
    private MotionListener listeners;
    public void setListener(MotionListener listeners) {
        this.listeners = listeners;
    }
    void detectMotion(){
        if(listeners != null)
            listeners.motionDetected(123);
    }
    interface MotionListener{
        void motionDetected(int sensorId);
    }
}*/

class MotionSensor{

    private MotionListener[] listeners;
    int size;

    public MotionSensor(){
        listeners = new MotionListener[10];
        size = 0;
    }

    public void setListener(MotionListener listener) {
        if(listener == null)
            return;
        if(size < this.listeners.length)
            this.listeners[size++] = listener;
    }

    void detectMotion(){
        for (int i = 0; i < size; i++) {
            this.listeners[i].motionDetected(123);
        }

    }

    interface MotionListener{
        void motionDetected(int sensorId);
    }

}

class Siren implements MotionSensor.MotionListener{

    @Override
    public void motionDetected(int sensorId) {
        System.out.println("alarm!!! motion detected at sensor " +
                sensorId);

    }
}


class Police implements MotionSensor.MotionListener{

    @Override
    public void motionDetected(int sensorId) {
        System.out.println("stop! you are under arrest...");
    }
}


class View{

}


class Button extends View{

    private OnClickListener listener;
    private String text;

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }

//לבדוק אם מישו ביקש את האינפורמציה
    void detectClick(){
        if(listener != null)
            listener.onClick(this);
    }

    interface OnClickListener{
        void onClick(View view);
    }
}
class Dog{
    private static Dog d;
    private String name;
    private Dog(){}

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public static Dog getDog(){
        if(d==null)
            d=new Dog();
        return d;

    }
}
