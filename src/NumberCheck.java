import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number; // Variable to store the valid number

        while (true) { // Infinite loop until a valid number is entered
            System.out.print("Enter a number: ");
            String input = scanner.nextLine(); // Take input as a string

            try {
                number = Double.parseDouble(input); // Try converting to a number
                break; // Exit loop if successful
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}