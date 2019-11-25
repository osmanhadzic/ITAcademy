package com.company;

public class Circle extends Shape {
    private double centerx, centery;
    private double x2,y2;
    private double surfec;
    private double radius;

    public Circle(double centerx, double centery, double x2, double y2) {
        this.centerx = centerx;
        this.centery = centery;
        this.x2 = x2;
        this.y2 = y2;
    }

    private void CalRadius(){
        radius = Math.sqrt(((x2 * x2) - (centerx * centerx)) + ((y2 * y2) - (centery * centery)));
    }

    @Override
    public double claculateSurface() {
        CalRadius();
        surfec = radius * radius * Math.PI;
        return surfec;
    }

    @Override
    public String toString() {
        return "Radius of circle is " + radius + " , surfes is : " + surfec;
    }
}
