import java.util.Scanner;
public class InputValidator {
    /**
     *
     * @param sc scanner object
     * @param msg message that shows as input instruction
     * @return valid double value
     */
    public static double takeDoubleInput(Scanner sc, String msg){
        double validDouble = 0.0;
        while (true) {
            System.out.print(msg);
            if (sc.hasNextDouble()) {
                validDouble = sc.nextDouble();
                return validDouble;
            } else {
                System.out.println("Invalid input. Please enter a valid double.");
                sc.next(); // Consume the invalid input
            }
        }
    }


}
