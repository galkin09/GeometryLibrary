package com.geometrylibrary;

public class Rectangle {
    double x, y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return x * y;
    }

    public double getPerimeter() {
        return 2 * x + 2 * y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}