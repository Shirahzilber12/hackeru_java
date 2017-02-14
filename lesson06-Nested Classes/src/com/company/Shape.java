package com.company;

/**
 * Created by hackeru on 2/12/2017.
 */
public class Shape {

    private Color color=new Color(4,5,12);


    public static class Color{
        private int red,green,blue;
        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }

        public Color(int red, int green, int blue) {

            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }
    }
}
