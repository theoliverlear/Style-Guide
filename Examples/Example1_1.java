package Examples;
import java.util.InputMismatchException; // Import the InputMismatchException class
import java.util.Scanner; // Import the Scanner class
public class Example1_1 { // Begin class
    public static void main(String[] args) { // Begin main method
        Scanner userInput = new Scanner(System.in); // Create a Scanner object
        boolean continueInput = true; // Create a boolean variable
        do { // Begin do-while loop
            try { // Begin try block
                System.out.println("Enter an integer: "); // Print a message
                int number = userInput.nextInt(); // Input an integer
                System.out.println("The number entered is " + number); // Print a message
                continueInput = false; // Exit the loop
            } catch (InputMismatchException ex) { // Begin catch block
                System.out.println("Try again. (Incorrect input: an integer" +
                               " is required)"); // Print a message
                userInput.nextLine(); // Clear input
            } // End catch block
        } while (continueInput); // End do-while loop
    } // End main method
} // End class