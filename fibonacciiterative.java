import java.util.Scanner;
public class fibonacciiterative {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}

//It takes an integer n as input, which is the number of Fibonacci terms to print.
// It initializes:
// a = 0
// b = 1
// Then it uses a loop from 1 to n:
// prints the current value of a
// calculates the next Fibonacci number using c = a + b
// updates a = b and b = c
// This keeps generating the sequence without using recursion.