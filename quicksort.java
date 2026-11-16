import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class quicksort {
    static int comparisons;
    static Random random = new Random();

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            comparisons++;
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quickSort(array, low, pivot - 1);
            quickSort(array, pivot + 1, high);
        }
    }

    static void randomizedQuickSort(int[] array, int low, int high) {
        if (low < high) {
            int randomPivot = low + random.nextInt(high - low + 1);
            swap(array, randomPivot, high);
            int pivot = partition(array, low, high);
            randomizedQuickSort(array, low, pivot - 1);
            randomizedQuickSort(array, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        if (n < 0) {
            System.out.println("Number of elements cannot be negative.");
            input.close();
            return;
        }
        int[] original = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            original[i] = input.nextInt();
        }

        int[] deterministic = Arrays.copyOf(original, n);
        comparisons = 0;
        quickSort(deterministic, 0, n - 1);
        int deterministicComparisons = comparisons;

        int[] randomized = Arrays.copyOf(original, n);
        comparisons = 0;
        randomizedQuickSort(randomized, 0, n - 1);
        int randomizedComparisons = comparisons;

        System.out.println("\nDeterministic quick sort:");
        System.out.println("Sorted array: " + Arrays.toString(deterministic));
        System.out.println("Comparisons: " + deterministicComparisons);

        System.out.println("\nRandomized quick sort:");
        System.out.println("Sorted array: " + Arrays.toString(randomized));
        System.out.println("Comparisons: " + randomizedComparisons);

        System.out.println("\nAverage time: O(n log n)");
        System.out.println("Worst-case time: O(n^2)");
        input.close();
    }
}
// Deterministic quicksort always chooses the last element as the pivot.
// Randomized quicksort chooses a random pivot.
// The program sorts the same input with both methods and counts their
// comparisons.
// Both average O(n log n) time and worst-case O(n²).
// In main, the program first reads how many numbers the user wants to sort,
// then reads those numbers into an array. It makes two copies because quicksort
// changes the array while sorting.

// It resets the comparison counter and runs deterministic quicksort on the
// first copy. Then it resets the counter again and runs randomized quicksort on
// the second copy. At the end, it prints both sorted arrays and the number of
// comparisons each method made.
