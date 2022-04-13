package com.netcracker.chapter2;

public class Point {
    private double x = 0;
    private double y = 0;

    public Point() {

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point translate(double x, double y){
        return new Point(this.x + x, this.y + y);
    }

    public Point scale(double coef_scale){
        return new Point(x*coef_scale,y * coef_scale);
    }


}
