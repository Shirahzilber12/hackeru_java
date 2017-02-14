package graphicshape;

public class Circle extends Shape{
    protected int x;
    int y;
    private  int radius;

    //יש בנאי  ברירת מחדל שהוא ריק
    public Circle(int x,int y,int radius){
       this.x=x;
        this.y=y;
        this.radius=radius;
    }
    //בנאי שקורה לבנאי נוסף הTHIS חייב לבוא בשורה הראשונה
    public Circle(int radius) {
        this(20,10,radius);
    }
    public Circle()
    {
        this(10);
        System.out.println("צריך להיות אחרי הTHIS ");
    }

    //super same this pointer to object that he have a metod
    //מחזיר את הכתובת שעליו יושב האוביקט מחזיר כסטרינג,הכתובת לפעמים היא מס בבסיס אקסדסמלי
    //@הוראות לקומפילר

   @Override
    public String toString() {return "center =("+x+" "+y+" "+radius+")";}
    public double area() { return Math.PI*radius*radius;}
    public  void fillColor(int red,int green,int blue){}
    public void fillColor(float hue,float saturation ,float brightness){}
    public double perimter(){
        return 2*Math.PI;
    }
}
