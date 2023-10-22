import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //setting the array size of the triangles in a constant
        final int NUMBER_OF_TRIANGLES = 3;
        //initiating empty array of triangles
        Triangle[] triangles = new Triangle[NUMBER_OF_TRIANGLES];

        //taking input from user and creating the triangles
        for (int t = 0; t < NUMBER_OF_TRIANGLES; t++) {
            System.out.println("---------------------------------------------");
            System.out.println("Taking input for triangle "+(t+1));
            System.out.println("---------------------------------------------");
            triangles[t]= takeInputForTriangle(sc,3);
        }
        //taking input for another point
        System.out.println("Taking input for a new point: ");
        Point newPoint = takePointInput(sc);
        //returning the type and perimeter for all the triangles
        for (int t = 0; t < NUMBER_OF_TRIANGLES; t++) {
            System.out.println("Detail of the triangle#"+(t+1)+": ");
            System.out.println("The type is "+triangles[t].getType()+" and the perimeter is "+triangles[t].getPerimeter());
            //extra mark portion
            System.out.println("The area of is "+triangles[t].getArea());
            String insideCheckMsg = triangles[t].isInsideTriangle(newPoint)?"The new point is inside the Triangle":"The new point is outside the Triangle";
            System.out.println(insideCheckMsg);
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