
public class MyFirstProgram {

    public static void main(String[] args) {
        Point p1 = new Point(2, 7);
        Point p2 = new Point(6, 5);
        System.out.println("Расстояние между точками = " + distance1(p1, p2));
    }

    public static double distance1(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}