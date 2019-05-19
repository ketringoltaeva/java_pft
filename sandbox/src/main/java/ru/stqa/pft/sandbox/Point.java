package ru.stqa.pft.sandbox;

public class Point {
    double x; // абсцисса точки
    double y; // ордината точки
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double distance(Point p){

        return Math.sqrt(Math.pow((this.x - this.x), 2) + Math.pow((this.y - this.y), 2));

    }

}
