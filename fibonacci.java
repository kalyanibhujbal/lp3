// Import BigInteger to store very large Fibonacci numbers
import java.math.BigInteger;

// Import Scanner to take input from the user
import java.util.Scanner;

// Class declaration
public class fibonacci {

    // Recursive method to calculate the nth Fibonacci number
    private static BigInteger fibonacciRecursive(int n) {

        // Base condition: first two Fibonacci numbers are 0 and 1
        if (n <= 1) {

            // Convert integer n into BigInteger and return it
            return BigInteger.valueOf(n);
        }

        // Calculate Fibonacci number by adding the previous two numbers
        // fibonacciRecursive(n - 1) gives the previous Fibonacci number
        // fibonacciRecursive(n - 2) gives the number before that
        return fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
    }

    // Method to print Fibonacci series using iteration (without recursion)
    private static void printIterative(int terms) {

        // Initialize the first Fibonacci number as 0
        BigInteger a = BigInteger.ZERO;

        // Initialize the second Fibonacci number as 1
        BigInteger b = BigInteger.ONE;

        // Loop runs until the required number of terms is printed
        for (int i = 0; i < terms; i++) {

            // Print the current Fibonacci number
            System.out.print(a + " ");

            // Calculate the next Fibonacci number by adding a and b
            BigInteger next = a.add(b);

            // Move b into a for the next iteration
            a = b;

            // Store the next Fibonacci number in b
            b = next;
        }

        // Move to the next line after printing the series
        System.out.println();
    }

    // Method to print Fibonacci series using recursion
    private static void printRecursive(int terms) {

        // Loop to print the required number of Fibonacci terms
        for (int i = 0; i < terms; i++) {

            // Calculate and print each Fibonacci number recursively
            System.out.print(fibonacciRecursive(i) + " ");
        }

        // Move to the next line after printing the series
        System.out.println();
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to read input
        // try-with-resources automatically closes Scanner after execution
        try (Scanner sc = new Scanner(System.in)) {

            // Ask the user to enter the number of terms
            System.out.print("Enter number of terms: ");

            // Read the number of terms
            int terms = sc.nextInt();

            // Check whether the entered number is negative
            if (terms < 0) {

                // Display an error message
                System.out.println("Number of terms cannot be negative.");

                // Stop program execution
                return;
            }

            // Display heading for iterative Fibonacci series
            System.out.println("Non-recursive Fibonacci series:");

            // Call the iterative method to print the Fibonacci series
            printIterative(terms);

            // Display time and auxiliary space complexity of iterative method
            System.out.println("Time complexity: O(n); auxiliary space: O(1)");

            // Display heading for recursive Fibonacci series
            System.out.println("Recursive Fibonacci series:");

            // Call the recursive method to print the Fibonacci series
            printRecursive(terms);

            // Display time and auxiliary space complexity of recursive method
            System.out.println("Time complexity: O(2^n); auxiliary space: O(n)");
        }
    }
}

// In this program, Fibonacci series is printed using two approaches:
// 1. Iterative approach (using loops).
// 2. Recursive approach (using a method calling itself).
//
// In the Fibonacci series, each number is the sum of the previous two numbers.
// Example: 0 1 1 2 3 5 8 13
//
// The iterative method uses a loop and updates two variables (a and b).
// The recursive method calculates each Fibonacci number by calling itself.
//
// In main(), the program accepts the number of terms from the user.
// It checks whether the input is negative.
// Then it calls both methods to print the Fibonacci series.
//
// BigInteger is used because Fibonacci numbers can become very large.
// It can store integers larger than the normal int and long data types.
