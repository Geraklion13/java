package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(4, 9);
        Point p2 = new Point(5, 3);
        System.out.println("Расстояние между точками = " + p1.distance(p2));
    }
}