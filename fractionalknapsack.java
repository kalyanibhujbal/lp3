// Import Arrays class to sort the items
import java.util.Arrays;

// Import Scanner class to take input from the user
import java.util.Scanner;

// Item class to store details of each item
class Item {

    // Variable to store the weight of an item
    int weight;

    // Variable to store the profit of an item
    int profit;

    // Variable to store the profit per unit weight
    double ratio;

    // Constructor to initialize item details
    Item(int weight, int profit) {

        // Store the given weight
        this.weight = weight;

        // Store the given profit
        this.profit = profit;

        // Calculate profit/weight ratio
        // If weight is positive, calculate the ratio; otherwise store 0
        this.ratio = (weight > 0) ? (double) profit / weight : 0.0;
    }
}

// Main class
public class fractionalknapsack {

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of items
        System.out.print("Enter number of items: ");

        // Read the number of items
        int n = sc.nextInt();

        // Check if the number of items is zero or negative
        if (n <= 0) {

            // Display maximum profit as zero
            System.out.println("Maximum Profit = 0");

            // Close Scanner
            sc.close();

            // Stop program execution
            return;
        }

        // Create an array of Item objects
        Item[] items = new Item[n];

        // Loop to accept weight and profit of each item
        for (int i = 0; i < n; i++) {

            // Ask for the weight of the current item
            System.out.print("Enter weight of item " + (i + 1) + ": ");

            // Read the weight
            int weight = sc.nextInt();

            // Ask for the profit of the current item
            System.out.print("Enter profit of item " + (i + 1) + ": ");

            // Read the profit
            int profit = sc.nextInt();

            // Check if the weight is zero or negative
            if (weight <= 0) {

                // Display a warning message
                System.out.println("Weight must be positive. Setting weight to 1.");

                // Set weight to 1 to avoid division by zero
                weight = 1;
            }

            // Check if the profit is negative
            if (profit < 0) {

                // Display a warning message
                System.out.println("Profit must be non-negative. Setting profit to 0.");

                // Set profit to zero
                profit = 0;
            }

            // Create an Item object and store it in the array
            items[i] = new Item(weight, profit);
        }

        // Ask the user to enter the knapsack capacity
        System.out.print("Enter knapsack capacity: ");

        // Read the capacity
        int capacity = sc.nextInt();

        // Check if capacity is zero or negative
        if (capacity <= 0) {

            // Display maximum profit as zero
            System.out.println("Maximum Profit = 0");

            // Close Scanner
            sc.close();

            // Stop program execution
            return;
        }

        // Sort items in descending order of profit/weight ratio
        // Items with higher ratios are placed first
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        // Variable to store the total profit
        double totalProfit = 0;

        // Loop through all items in sorted order
        for (Item item : items) {

            // Stop if the knapsack has no remaining capacity
            if (capacity == 0) {
                break;
            }

            // Check if the complete item can fit in the knapsack
            if (item.weight <= capacity) {

                // Reduce the remaining capacity by the item's weight
                capacity -= item.weight;

                // Add the complete item's profit
                totalProfit += item.profit;
            }

            // If the complete item cannot fit
            else {

                // Calculate the fraction of the item that can be taken
                double fraction = (double) capacity / item.weight;

                // Add profit according to the fraction taken
                totalProfit += item.profit * fraction;

                // Knapsack becomes completely full
                capacity = 0;
            }
        }

        // Display the maximum total profit
        System.out.println("Maximum Profit = " + totalProfit);

        // Close Scanner
        sc.close();
    }
}

// This program uses the Greedy Method to solve the Fractional Knapsack problem.
// First, it calculates the profit/weight ratio of every item.
// Then, it sorts items in descending order of their ratios.
// It selects items with the highest ratio first.
// If an item fits completely, it takes the whole item.
// Otherwise, it takes only the required fraction of that item.
// Finally, it displays the maximum total profit.
