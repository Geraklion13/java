package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        Point p = new Point(4, 9);
        System.out.println("Расстояние между точками = " + p.distance());
    }
}