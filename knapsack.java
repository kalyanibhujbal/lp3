// Import Scanner class to take input from the user
import java.util.Scanner;

// Class declaration
public class knapsack {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of items
        System.out.print("Enter number of items: ");

        // Read the number of items
        int n = sc.nextInt();

        // Create an array to store the weights of items
        int[] weight = new int[n];

        // Create an array to store the profits of items
        int[] profit = new int[n];

        // Loop to accept weight and profit of each item
        for (int i = 0; i < n; i++) {

            // Ask for the weight of the current item
            System.out.print("Enter weight of item " + (i + 1) + ": ");

            // Store the weight in the weight array
            weight[i] = sc.nextInt();

            // Ask for the profit of the current item
            System.out.print("Enter profit of item " + (i + 1) + ": ");

            // Store the profit in the profit array
            profit[i] = sc.nextInt();
        }

        // Ask the user to enter the maximum knapsack capacity
        System.out.print("Enter knapsack capacity: ");

        // Read the capacity of the knapsack
        int W = sc.nextInt();

        // Create a DP table with (n+1) rows and (W+1) columns
        // Rows represent the number of items
        // Columns represent the knapsack capacity
        int[][] dp = new int[n + 1][W + 1];

        // Loop through all items, including zero items
        for (int i = 0; i <= n; i++) {

            // Loop through all capacities from 0 to W
            for (int w = 0; w <= W; w++) {

                // If there are no items or capacity is zero
                if (i == 0 || w == 0) {

                    // Maximum profit is zero
                    dp[i][w] = 0;
                }

                // Check if the current item's weight is less than
                // or equal to the current knapsack capacity
                else if (weight[i - 1] <= w) {

                    // Find the maximum profit between two choices:
                    // 1. Include the current item
                    // 2. Exclude the current item
                    dp[i][w] = Math.max(

                        // Profit after including the current item
                        // Add its profit to the best profit for remaining capacity
                        profit[i - 1] + dp[i - 1][w - weight[i - 1]],

                        // Profit after excluding the current item
                        dp[i - 1][w]
                    );
                }

                // If the current item's weight is greater than capacity
                else {

                    // We cannot include the current item
                    // So copy the previous row's profit
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        // Display the maximum profit stored in the last cell of DP table
        System.out.println("Maximum Profit = " + dp[n][W]);

        // Close Scanner
        sc.close();
    }
}

// This is the 0/1 Knapsack problem using Dynamic Programming.
// Each item can either be selected (1) or not selected (0).
// We cannot select the same item more than once.
// The DP table stores the maximum profit for different item counts
// and knapsack capacities.
// For every item, we check two choices:
// 1. Include the item.
// 2. Exclude the item.
// Math.max() selects the choice that gives higher profit.
// Finally, dp[n][W] contains the maximum possible profit.
