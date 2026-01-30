import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        long factorial = 1; // Use 'long' because factorials grow very fast!
        
        if (number < 0) {
            System.out.println("Error: Please enter a non-negative number.");
        } else {
            // Loop to calculate the result
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
        
        scanner.close();
    }
}
