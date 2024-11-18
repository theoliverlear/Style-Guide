package examples.java;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example1_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);         // Read user input
        boolean continueInput = true;
        do {
            try {
                System.out.println("Enter an integer: ");
                int number = userInput.nextInt();          // Input an integer
                System.out.println("The number entered is " + number);
                continueInput = false;                        // Exit the loop
            } catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer" +
                                   " is required)");
                userInput.nextLine();                           // Clear input
            }
        } while (continueInput);
    }
}