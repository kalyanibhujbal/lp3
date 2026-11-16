import java.math.BigInteger;
import java.util.Scanner;

public class fibonacci {
    private static BigInteger fibonacciRecursive(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        return fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
    }

    private static void printIterative(int terms) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            BigInteger next = a.add(b);
            a = b;
            b = next;
        }
        System.out.println();
    }

    private static void printRecursive(int terms) {
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of terms: ");
            int terms = sc.nextInt();

            if (terms < 0) {
                System.out.println("Number of terms cannot be negative.");
                return;
            }

            System.out.println("Non-recursive Fibonacci series:");
            printIterative(terms);
            System.out.println("Time complexity: O(n); auxiliary space: O(1)");

            System.out.println("Recursive Fibonacci series:");
            printRecursive(terms);
            System.out.println("Time complexity: O(2^n); auxiliary space: O(n)");
        }
    }
}

// In main, the program opens a Scanner to read the requested number of terms.
// It checks that the input isn’t negative; if it is, it prints an error and
// exits. Otherwise, it calls printIterative(terms) and printRecursive(terms) to
// display the sequence using each approach, then prints their time and space
// complexities. The try block automatically closes the scanner when execution
// finishes.