public class FactorialExample {
    public static void main(String[] args) {
        // Instead of Scanner, we take the first argument passed to the program
        if (args.length == 0) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + number + " is: " + factorial);
    }
}
