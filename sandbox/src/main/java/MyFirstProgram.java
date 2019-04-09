public class MyFirstProgram {

    public static void main(String[] args) {
        Point p = new Point(7,2, 6,5);
        System.out.println("Расстояние между точками = " + distance(p));
    }

    public static double distance(Point p) {
        return Math.sqrt(Math.pow((p.x2 - p.x1), 2) + Math.pow((p.y2 - p.y1), 2));

    }

}