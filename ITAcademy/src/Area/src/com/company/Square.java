package com.company;

public class Square extends Shape {
    private double x1,x2,x3,x4;
    private double y1,y2,y3,y4;
    private double surfec;
    private double side1,side3;

    public Square(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }

    private void sideCalculate(){
        side1 = Math.sqrt(((x2 * x2) - (x1 * x1)) + ((y2 * y2) - (y1 * y1)));
        side3 = Math.sqrt(((x3 * x3) - (x1 * x1)) + ((y3 * y3) - (y1* y1)));
    }

    @Override
    public double claculateSurface() {
        sideCalculate();
        if(side1==side3){
            surfec = side1 * side1;
            return surfec;
        }else return 0;

    }

    @Override
    public String toString() {
        return "Sides of square  is: " + side1 +  " surfec is " + surfec;
    }
}
