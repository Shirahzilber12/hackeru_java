package com.company;

/**
 * Created by hackeru on 2/1/2017.
 */
public class Canvas {
    private boolean[][] canvas;
    public Canvas(int width,int height )
    {
        canvas=new boolean[width][height];
    }
    //מצייר למערך
    public void drawRectangle(int x,int y, int width,int height )
    {
        int col=0,row=0;
        for (int i = 0; i < y; i++)
            row++;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < x; j++)
                col++;
            for (int j = 0; j < width; j++) {
                if(i==0 || i==height-1 || j == 0 || j == width-1)
                    canvas[row][col++]=true;
                    col++;
            }
            row++;
            col=0;
        }
    }
    public void drawRectangle1(int x,int y, int width,int height )
    {
        for (int i = 0; i <width ; i++) {
            canvas[y][x+i]=true;
            canvas[y+height][x+i]=true;
        }
        for (int i = 0; i <height ; i++) {
            canvas[y+1][x]=true;
            canvas[y+1][x+width]=true;
        }
    }


    //מצייר למסך
    public void render()
    {
        for (int i = 0; i <canvas.length ; i++) {
            for (int j = 0; j <canvas[i].length ; j++)
                //בגלל שזה באוליני אין צורך לשאול כי ברגע שמצבים ? הכונה לtrue
                System.out.print(canvas[i][j]?"*":" ");{
            }
            System.out.println();

        }
    }
}

