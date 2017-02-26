package com.company;

public class Main {


    public static void main(String[] args) {
        Station[] stations={
                new Station(2,3),
                new Station(1,2),
                new Station(3,1),
        };

        System.out.print("the station"+" "+Station.findStation(stations));


     /*   Queue queue = new Queue();
        for (int i = 1; i < 4; i++) {
            queue.insert(i);
        }
        queue.pop();
        queue.insert(15);
        printQ(queue);*/
    }
/*    public static void printQ(Queue t){
        while(!t.isEmpty()) {
            System.out.print(t.pop()+" ");;
        }
    }*/

}
