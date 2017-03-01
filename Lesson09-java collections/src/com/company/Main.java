package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        //String s1 = "asis";
        //String s2 = "Tsis";
        char[] temp1 = {'a','s','i','s'};
        char[] temp2 = {'T', 's', 'i', 's'};
        MyString s1 = new MyString(temp1);
        MyString s2 = new MyString(temp2);
        System.out.println( s1.compareTo(s2));

        Station[] stations = {
                new Station(2, 3),
                new Station(1, 2),
                new Station(3, 1),
        };

        System.out.print("the station" + " " + Station.findStation2(stations));
        /*   Queue queue = new Queue();
        for (int i = 1; i < 4; i++) {
            queue.insert(i);
        }
        queue.pop();
        queue.insert(15);
        printQ(queue);*/


    /*    public static void printQ(Queue t){
            while(!t.isEmpty()) {
                System.out.print(t.pop()+" ");;
            }
        }*/

        MyString myString=new MyString(new char[]{'s','h','i','r','a','a'});
        MyString Sarah=new MyString(new char[]{'s','h','i','r','a'});
        System.out.println();
        System.out.println("my index of"+" " +myString.indexOf(Sarah));
        MyString[] m=myString.spilt('e');
        for (int i = 0; m[i]!=null; i++) {
            for (int j = 0; j <m[i].myChar.length&&m[i].myChar[j]!=0; j++) {
                System.out.print(m[i].myChar[j]);
            }

        }


        Set<Point> points = new HashSet<>();
        Point p1 = new Point(3, 5);
        Point p2 = new Point(3, 4);
        // במקום hasCode and equals
        Map<String, User> users = new HashMap<>();
        User user1 = new User("Sapir", "12345");
        User user2 = new User("Maayan", "123456");
        User user3 = new User("Avi", "123456");

//put -
        User put = users.put(user1.getUserName(), user1);
        users.put(user2.getUserName(), user2);
        users.put(user3.getUserName(), user3);

       // System.out.println(users.size());

/* //get - we cant search by value, we must send key
User user3 =users.get(user1.getUserName());// בגלל הגנריות לא נדרשנו לעשות המרה - downcasting
*/
// עוד מתודות : clear, , containKey

        Iterator<User> allTheUsers = users.values().iterator();
        while (allTheUsers.hasNext())

        {
            User u = allTheUsers.next();
        }

    }
}
    class User {
        private String name;
        private String password;

        public String getUserName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public User(String name, String password) {

            this.name = name;
            this.password = password;
        }
    }
