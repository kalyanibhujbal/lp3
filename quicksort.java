// Import Arrays class to copy arrays and print them
import java.util.Arrays;

// Import Random class to generate a random pivot
import java.util.Random;

// Import Scanner class to take input from the user
import java.util.Scanner;

// Class declaration
public class quicksort {

    // Variable to count the number of comparisons
    static int comparisons;

    // Random object to generate random numbers
    static Random random = new Random();

    // Method to swap two elements in an array
    static void swap(int[] array, int i, int j) {

        // Store the first element temporarily
        int temp = array[i];

        // Put the second element at the first position
        array[i] = array[j];

        // Put the first element at the second position
        array[j] = temp;
    }

    // Partition method: places the pivot at its correct position
    static int partition(int[] array, int low, int high) {

        // Select the last element as the pivot
        int pivot = array[high];

        // Initialize i before the starting index
        int i = low - 1;

        // Traverse the array from low to high - 1
        for (int j = low; j < high; j++) {

            // Increase comparison count
            comparisons++;

            // Check if the current element is smaller than or equal to pivot
            if (array[j] <= pivot) {

                // Move the boundary of smaller elements forward
                i++;

                // Swap the current element with the element at i
                swap(array, i, j);
            }
        }

        // Place the pivot in its correct sorted position
        swap(array, i + 1, high);

        // Return the final position of the pivot
        return i + 1;
    }

    // Deterministic Quick Sort method
    static void quickSort(int[] array, int low, int high) {

        // Continue sorting if the subarray has more than one element
        if (low < high) {

            // Partition the array and get the pivot position
            int pivot = partition(array, low, high);

            // Recursively sort the left part of the pivot
            quickSort(array, low, pivot - 1);

            // Recursively sort the right part of the pivot
            quickSort(array, pivot + 1, high);
        }
    }

    // Randomized Quick Sort method
    static void randomizedQuickSort(int[] array, int low, int high) {

        // Continue sorting if the subarray has more than one element
        if (low < high) {

            // Generate a random index between low and high
            int randomPivot = low + random.nextInt(high - low + 1);

            // Move the randomly selected pivot to the last position
            swap(array, randomPivot, high);

            // Partition the array using the selected pivot
            int pivot = partition(array, low, high);

            // Recursively sort the left part
            randomizedQuickSort(array, low, pivot - 1);

            // Recursively sort the right part
            randomizedQuickSort(array, pivot + 1, high);
        }
    }

    // Main method: execution of the program starts here
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Ask the user for the number of elements
        System.out.print("Enter number of elements: ");

        // Read the number of elements
        int n = input.nextInt();

        // Check whether the number of elements is negative
        if (n < 0) {

            // Display error message
            System.out.println("Number of elements cannot be negative.");

            // Close Scanner
            input.close();

            // Stop program execution
            return;
        }

        // Create an array of size n
        int[] original = new int[n];

        // Ask the user to enter array elements
        System.out.println("Enter the elements:");

        // Read all elements into the original array
        for (int i = 0; i < n; i++) {
            original[i] = input.nextInt();
        }

        // Create a copy of the original array for deterministic Quick Sort
        int[] deterministic = Arrays.copyOf(original, n);

        // Reset comparison counter to zero
        comparisons = 0;

        // Apply deterministic Quick Sort
        quickSort(deterministic, 0, n - 1);

        // Store the number of comparisons made
        int deterministicComparisons = comparisons;

        // Create another copy for randomized Quick Sort
        int[] randomized = Arrays.copyOf(original, n);

        // Reset comparison counter again
        comparisons = 0;

        // Apply randomized Quick Sort
        randomizedQuickSort(randomized, 0, n - 1);

        // Store the number of comparisons made
        int randomizedComparisons = comparisons;

        // Display deterministic Quick Sort result
        System.out.println("\nDeterministic quick sort:");

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(deterministic));

        // Print the number of comparisons
        System.out.println("Comparisons: " + deterministicComparisons);

        // Display randomized Quick Sort result
        System.out.println("\nRandomized quick sort:");

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(randomized));

        // Print the number of comparisons
        System.out.println("Comparisons: " + randomizedComparisons);

        // Display average time complexity
        System.out.println("\nAverage time: O(n log n)");

        // Display worst-case time complexity
        System.out.println("Worst-case time: O(n^2)");

        // Close Scanner
        input.close();
    }
}

// Deterministic Quick Sort always selects the last element as the pivot.
// Randomized Quick Sort selects a random element as the pivot.
// Both methods sort the same original input array.
// Two separate copies are used because sorting changes the array.
// The program counts and compares the number of comparisons made by both methods.
