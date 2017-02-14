package graphicshape;

import com.company.Ball;

/**
 * Created by hackeru on 2/5/2017.
 */
public class Canvas {
    //השדות null
    //private boolean[][] canvas;
    //שווה ערך למה שכתוב בתוך הקונסטרקטור
    private final boolean[][] canvas=new boolean[10][10];

    public Canvas() {
        //this.canvas=new boolean[10][10];
    }
    void draw(){
        Circle c=new Circle();
        c.x=120;
        Ball b=new Ball();
        final int y=5;
        //
        //y++;
    }
}

