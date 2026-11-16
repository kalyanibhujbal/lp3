import java.util.Scanner;
public class fibonaccirecursive {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
}

//It defines a method called fibonacci(int n).
// Base cases:
// if n == 0, return 0
// if n == 1, return 1
// Otherwise, it calls itself twice:
// fibonacci(n - 1)
// fibonacci(n - 2)
// Then it adds both results.
// In the main method:

// the user enters how many Fibonacci terms to print
// a loop runs from 0 to n-1
// each value is printed using fibonacci(i)