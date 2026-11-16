import java.util.Arrays;
import java.util.Scanner;

class Item {
    int weight;
    int profit;
    double ratio;

    Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.ratio = (weight > 0) ? (double) profit / weight : 0.0;
    }
}

public class fractionalknapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Maximum Profit = 0");
            sc.close();
            return;
        }

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            int weight = sc.nextInt();

            System.out.print("Enter profit of item " + (i + 1) + ": ");
            int profit = sc.nextInt();

            if (weight <= 0) {
                System.out.println("Weight must be positive. Setting weight to 1.");
                weight = 1;
            }

            if (profit < 0) {
                System.out.println("Profit must be non-negative. Setting profit to 0.");
                profit = 0;
            }

            items[i] = new Item(weight, profit);
        }

        System.out.print("Enter knapsack capacity: ");
        int capacity = sc.nextInt();

        if (capacity <= 0) {
            System.out.println("Maximum Profit = 0");
            sc.close();
            return;
        }

        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));

        double totalProfit = 0;
        for (Item item : items) {
            if (capacity == 0) {
                break;
            }

            if (item.weight <= capacity) {
                capacity -= item.weight;
                totalProfit += item.profit;
            } else {
                double fraction = (double) capacity / item.weight;
                totalProfit += item.profit * fraction;
                capacity = 0;
            }
        }

        System.out.println("Maximum Profit = " + totalProfit);
        sc.close();
    }
}

// It first reads:
// number of items
// each item’s weight and profit
// knapsack capacity
// Then it calculates each item’s profit/weight ratio.
// It sorts items in descending order of ratio so the most valuable items are
// taken first.
// It loops through the sorted list:
// if an item fits fully, it is added completely
// otherwise, only a fraction of it is taken based on remaining capacity
// Finally, it prints the maximum total profit.