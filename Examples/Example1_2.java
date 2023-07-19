package Examples;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);             // Read user input
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();              // Input an integer
                System.out.println("The number entered is " + number);
                continueInput = false;                        // Exit the loop
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer" +
                                   " is" + " required)");
                input.nextLine();                               // Clear input
            }
        } while (continueInput);
    }
}