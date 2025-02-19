import java.util.*;

public class Main {

    double add(double num1, double num2) {
        return num1 + num2;
    }

    double subtract(double num1, double num2) {
        return num1 - num2;
    }

    double multiply(double num1, double num2) {
        return num1 * num2;
    }

    double divide(double num1, double num2) {
        return num1 / num2;

    }

    public static void typeEffect(String message) throws InterruptedException {
        for (int i = 0; i <= message.length(); i++) {
            System.out.print("\r" + message.substring(0, i)); // Overwrite effect
            Thread.sleep(50); // Adjust speed as needed
        }
        System.out.println(); // Move to next line after animation
    }

    public static double getValidNumber(Scanner scanner) {
        double number;
        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
                break; // If conversion succeeds, exit loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return number;
    }


    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Main obj = new Main();

        System.out.println();
        System.out.println("|| Simple Calculator program ||");
        Thread.sleep(250);

        System.out.print("Loading");

        for (int i = 0; i < 5; i++) { // Print 5 dots
            Thread.sleep(250); // 250ms delay
            System.out.print(".");
        }
        while (true) {
            Thread.sleep(250);
            System.out.println("\n");
            Thread.sleep(250);
            System.out.println("Type '+' for performing Addition");
            Thread.sleep(250);
            System.out.println("Type '-' for performing Subtraction");
            Thread.sleep(250);
            System.out.println("Type '*' for performing multiplication");
            Thread.sleep(250);
            System.out.println("Type '/' for performing Division");
            Thread.sleep(250);
            System.out.println("Type 'Exit' for Exiting from the program");
            System.out.print("\n");
            Thread.sleep(250);
            System.out.print("Enter what operation you want to perform : ");

            String type = scanner.next();

            if (type.equalsIgnoreCase("exit")) {
                System.out.println("Exiting calculator...");
                break; // Exit the loop
            }

            switch (type) {

                case "+":
                    Thread.sleep(250);
                    System.out.println("* You chose addition *");
                    Thread.sleep(250);
                    System.out.print("Enter your 1st number : ");
                    double num1_add = scanner.nextDouble();
                    System.out.print("Enter your 2nd number : ");
                    double num2_add = scanner.nextDouble();
                    double total_add = obj.add(num1_add, num2_add);

                    //System.out.print("\n");
                    System.out.print("calculating");

                    for (int i = 0; i < 3; i++) { // Print 5 dots
                        Thread.sleep(250); // 250ms delay
                        System.out.print(".");
                    }
                    System.out.println("\n");
                    Thread.sleep(250);
                    System.out.println("The result is : " +total_add);
                    Thread.sleep(250);

                    System.out.print("\n");
                    System.out.print("Do you want to continue? (y/n): ");
                    String choice1 = scanner.next();

                    if (choice1.equalsIgnoreCase("y")) {
                        continue;
                    }
                    else if (choice1.equalsIgnoreCase("yes")) {
                            continue;// Restart the loop
                    } else{
                        System.out.println("Exiting calculator...");
                        return;  // Exit the method completely
                    }

                case "-":
                    Thread.sleep(250);
                    System.out.println("* You chose subtraction *");
                    Thread.sleep(250);
                    System.out.print("Enter your 1st number : ");
                    double num1_sub = scanner.nextDouble();
                    System.out.print("Enter your 2nd number : ");
                    double num2_sub = scanner.nextDouble();
                    double total_sub = obj.subtract(num1_sub, num2_sub);

                    //System.out.print("\n");
                    System.out.print("calculating");

                    for (int i = 0; i < 3; i++) { // Print 5 dots
                        Thread.sleep(250); // 250ms delay
                        System.out.print(".");
                    }
                    System.out.println("\n");
                    Thread.sleep(250);
                    System.out.println("The result is : " +total_sub);
                    Thread.sleep(250);


                    System.out.println("Do you want to continue? (y/n): ");
                    String choice2 = scanner.next();

                    if (choice2.equalsIgnoreCase("y")) {
                        continue;
                    }
                    else if (choice2.equalsIgnoreCase("yes")) {
                        continue;// Restart the loop
                    } else{
                        System.out.println("Exiting calculator...");
                        return;  // Exit the method completely
                    }

                case "*":
                    Thread.sleep(250);
                    System.out.println("* You chose multiplication *");
                    Thread.sleep(250);
                    System.out.print("Enter your 1st number : ");
                    double num1_multiply = scanner.nextDouble();
                    System.out.print("Enter your 2nd number : ");
                    double num2_multiply = scanner.nextDouble();
                    double total_multiply = obj.multiply(num1_multiply, num2_multiply);

                    //System.out.print("\n");
                    System.out.print("calculating");

                    for (int i = 0; i < 3; i++) { // Print 5 dots
                        Thread.sleep(250); // 250ms delay
                        System.out.print(".");
                    }
                    System.out.println("\n");
                    Thread.sleep(250);
                    System.out.println("The result is : " +total_multiply);
                    Thread.sleep(250);

                    System.out.println("Do you want to continue? (y/n): ");
                    String choice3 = scanner.next();

                    if (choice3.equalsIgnoreCase("y")) {
                        continue;
                    }
                    else if (choice3.equalsIgnoreCase("yes")) {
                        continue;// Restart the loop
                    } else{
                        System.out.println("Exiting calculator...");
                        return;  // Exit the method completely
                    }

                case "/":
                    Thread.sleep(250);
                    System.out.println("* You chose division *");
                    Thread.sleep(250);
                    System.out.print("Enter your 1st number : ");
                    double num1_division = scanner.nextDouble();
                    System.out.print("Enter your 2nd number : ");
                    double num2_division = scanner.nextDouble();
                    double total_division = obj.divide(num1_division, num2_division);

                    //System.out.print("\n");
                    System.out.print("calculating");
                    for (int i = 0; i < 3; i++) { // Print 5 dots
                        Thread.sleep(250); // 250ms delay
                        System.out.print(".");
                    }


                    System.out.println("\n");
                    Thread.sleep(250);
                    //System.out.println("The result is : " +total_division);
                    if (num2_division != 0)
                        System.out.println("The result is: " +total_division);
                    else
                        typeEffect("Error: Division by zero!");
                    Thread.sleep(250);

                    System.out.println("Do you want to continue? (y/n): ");
                    String choice4 = scanner.next();

                    if (choice4.equalsIgnoreCase("y")) {
                        continue;
                    }
                    else if (choice4.equalsIgnoreCase("yes")) {
                        continue;// Restart the loop
                    } else{
                        System.out.println("Exiting calculator...");
                        return;  // Exit the method completely
                    }

                default:
                    System.out.println("Invalid number...uhh, Error x_x ");
                    Thread.sleep(500);

                    System.out.print("Do you want to try again? (yes/no): ");
                    String choice = scanner.next();

                    if (choice.equalsIgnoreCase("yes")) {
                        continue;  // Restart the loop
                    } else if (choice.equalsIgnoreCase("y")) {
                        continue;
                    }else if(choice.equalsIgnoreCase("no")) {
                        Thread.sleep(500);
                        System.out.println("okay :(");
                        Thread.sleep(500);
                        System.out.println("Exiting calculator...");
                        return;  // Exit the method completely
                    } else {
                        System.out.print("\n");
                        Thread.sleep(500);
                        System.out.println("Ehh...that doesn't seem like a yes or no :/");
                        Thread.sleep(500);
                        System.out.println("Anyway -_-");
                        Thread.sleep(500);
                        System.out.println("Exiting calculator...");
                        Thread.sleep(500);
                        System.out.println("bye.");
                        return;  // Exit the method completely

                }

            }

        }
    }
}

