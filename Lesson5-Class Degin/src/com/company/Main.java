package com.company;
//החכמה היא לשים את החכמה בבסיס יסודות איתנים
public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Point p1=null,p2=null;
        if(p1==p2)//השואה תחזיר טוב
        {System.out.println(true);}
        *//*if(p1.equals(p1)){
            System.out.println("f");
            //Exception in thread "main" java.lang.NullPointerException
        }*/
        Point p1=new Point(8,3);
        System.out.println(p1.hashCode());
        D d=new D();
        d.y=5;
        //לא דרך אוביקט אלה למחלקה
        D.x=5;
        D.func7();
        //d.func7(); לא טוב כי זה פועל רק על המחלקה
        D d1=new D();
        D d2=new D();
        System.out.println("count"+D.getCount());

    }
}

abstract class A {
    void func1() {
        System.out.println("in func1");
    }
    abstract void func2();
}
abstract class B extends A{
    void func2() {
        System.out.println("func2");
    }
}
class C extends B{
    int y=6;
    int z=y;

    public C(int y, int z) {
        this.y = y;
        this.z = z;
    }

    final int x=5;
    @Override
    void func1() {
        System.out.println("נדרס");
    }
    @Override
    void func2() {
        System.out.println("נדרס2");
    }
    final  void func5(final int param){
        //לא חוקי משתנה קבוע
        //param=5;
        final int temp=5;
        //temp++; temp is final
        //אא לדרוס מתודות שהם FINAL
    }

}
class Dog{
    String name;
  private static int count=0;
    public Dog(){
        count++;
    }

    public static int getCount() {
        return count;
    }
}
class D{
    private static int count=0;
    final Dog d;
    //ההבדל בינהם Y
    static int x;
    int y;
//d מכיל כתובת לאיבר בזיכרון
    public D(Dog d) {
        this.d = d;
    }

    public static int getCount() {
        return count;
    }

    public D() {
        this.d = null;
        count++;
    }
    void func6(){
        //d הוא כתובת ואת הכתובת אסור לשנות!!!!
        //this.d=new Dog();
        this.d.name="ss";
    }
    static void func7(){
        System.out.println("func7");
        //System.out.print(y);-y זה אוביקט ממחלקה
        System.out.println(x);//x is static;
    }



}



