public class Test {
}
//import java.util.Scanner;
//
//class Point {
//    private double x;
//    private double y;
//
//    public Point(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//}
//
//class Triangle {
//    private Point[] points = new Point[3];
//
//    public Triangle(Point p1, Point p2, Point p3) {
//        points[0] = p1;
//        points[1] = p2;
//        points[2] = p3;
//    }
//
//    public double calculatePerimeter() {
//        double side1 = calculateDistance(points[0], points[1]);
//        double side2 = calculateDistance(points[1], points[2]);
//        double side3 = calculateDistance(points[2], points[0]);
//        return side1 + side2 + side3;
//    }
//
//    private double calculateDistance(Point p1, Point p2) {
//        double dx = p1.getX() - p2.getX();
//        double dy = p1.getY() - p2.getY();
//        return Math.sqrt(dx * dx + dy * dy);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter coordinates for Point 1 (x y):");
//        double x1 = scanner.nextDouble();
//        double y1 = scanner.nextDouble();
//        Point p1 = new Point(x1, y1);
//
//        System.out.println("Enter coordinates for Point 2 (x y):");
//        double x2 = scanner.nextDouble();
//        double y2 = scanner.nextDouble();
//        Point p2 = new Point(x2, y2);
//
//        System.out.println("Enter coordinates for Point 3 (x y):");
//        double x3 = scanner.nextDouble();
//        double y3 = scanner.nextDouble();
//        Point p3 = new Point(x3, y3);
//
//        Triangle triangle = new Triangle(p1, p2, p3);
//        double perimeter = triangle.calculatePerimeter();
//        System.out.println("The perimeter of the triangle is: " + perimeter);
//    }
//}
