import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_OF_TRIANGLES = 3; //setting the array size of the triangles in a constant
        Triangle[] triangles = new Triangle[NUMBER_OF_TRIANGLES]; //initiating empty array of triangles
        for (int t = 0; t < NUMBER_OF_TRIANGLES; t++) {
            System.out.println("---------------------------------------------");
            System.out.println("Taking input for triangle "+(t+1));
            System.out.println("---------------------------------------------");
            triangles[t]= takeInputForTriangle(sc,3);

        }
        for (Triangle triangle:triangles) {
            System.out.println("The type of triangle is "+triangle.getType()+" and the perimeter is "+triangle.getPerimeter());
        }

    }

    public static Triangle takeInputForTriangle(Scanner sc, int numberOfVertices){
        Point[] pointsFromUser = new Point[numberOfVertices];
        for (int v = 0; v < numberOfVertices; v++) {
            System.out.println("Taking point for vertices "+(v+1)+": ");
            Point point= takePointInput(sc);
            pointsFromUser[v]=point;
        }
        return new Triangle(pointsFromUser);
    }
    public static Point takePointInput(Scanner sc){
        double x =  InputValidator.takeDoubleInput(sc, "Enter x: ");
        double y =  InputValidator.takeDoubleInput(sc, "Enter y: ");
        return new Point(x,y);
    }
}