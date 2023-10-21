import java.util.Scanner;
public class InputValidator {
    public static double takeDoubleInput(Scanner sc, String msg){
        double validDouble = 0.0;
        boolean validInput = false;

        while (true) {
            System.out.print(msg);
            if (sc.hasNextDouble()) {
                validDouble = sc.nextDouble();
                return validDouble;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                sc.nextLine(); // Consume the invalid input
            }
        }
    }


}
