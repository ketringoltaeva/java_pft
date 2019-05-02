package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello,world!");

    Point p1 = new Point(3,4);
    Point p2 = new Point(5,7);

    System.out.println("Расстояние между точками p1 и p2 = " + distance(p1, p2));
  }
 public static double distance (Point p1, Point p2) {

    return Math.sqrt( Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2));
 }

}