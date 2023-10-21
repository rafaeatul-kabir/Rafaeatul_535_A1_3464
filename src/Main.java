import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int NUMBER_OF_TRIANGLES = 3;
        Triangle
        for (int t = 0; t < NUMBER_OF_TRIANGLES; t++) {
            final int NUMBER_OF_VERTICES_FOR_TRIANGLE= 3;
            Point[] userInput = new Point[3];
            for (int v = 0; v < NUMBER_OF_VERTICES_FOR_TRIANGLE; v++) {
                double x =  InputValidator.takeDoubleInput(sc, "Enter x point for vertices "+(v+1)+": ");
                double y =  InputValidator.takeDoubleInput(sc, "Enter y point for vertices "+(v+1)+": ");
                Point point= new Point(x,y);
                userInput[v]=point;
            }
            Triangle triangle
        }

    }
}