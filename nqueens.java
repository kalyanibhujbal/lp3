// Import Scanner class to take input from the user
import java.util.Scanner;

// Class declaration
public class nqueens {

    // Static variable to store the size of the chessboard
    static int N;

    // Method to check whether placing a queen at a given position is safe
    static boolean isSafe(int board[][], int row, int col) {

        // Check the same column for previously placed queens
        for (int i = 0; i < row; i++) {

            // If a queen is already present in the same column
            if (board[i][col] == 1)

                // Return false because the position is not safe
                return false;
        }

        // Check the upper left diagonal for previously placed queens
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            // If a queen is found on the upper left diagonal
            if (board[i][j] == 1)

                // Return false because the position is not safe
                return false;
        }

        // Check the upper right diagonal for previously placed queens
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {

            // If a queen is found on the upper right diagonal
            if (board[i][j] == 1)

                // Return false because the position is not safe
                return false;
        }

        // If no queen is found in the column or diagonals
        // The position is safe
        return true;
    }

    // Recursive method to solve the N-Queens problem using backtracking
    static boolean solveNQueens(int board[][], int row) {

        // Base condition: if all N rows are filled with queens
        if (row == N)

            // Return true because a solution is found
            return true;

        // Try placing a queen in every column of the current row
        for (int col = 0; col < N; col++) {

            // Check whether the current position is safe
            if (isSafe(board, row, col)) {

                // Place a queen at the current row and column
                // 1 represents a queen
                board[row][col] = 1;

                // Recursively try to place a queen in the next row
                if (solveNQueens(board, row + 1))

                    // If all queens are placed successfully, return true
                    return true;

                // Backtracking:
                // Remove the queen if the current placement does not lead to a solution
                board[row][col] = 0;
            }
        }

        // Return false if no safe position is available in the current row
        return false;
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask the user to enter the number of queens
        System.out.print("Enter value of N: ");

        // Read the value of N
        N = sc.nextInt();

        // Create an N x N chessboard
        // Initially, all positions contain 0
        int board[][] = new int[N][N];

        // Variable to check whether a solution is found
        boolean solved = false;

        // Try placing the first queen in each column of the first row
        // Continue until a solution is found or all columns are checked
        for (int col = 0; col < N && !solved; col++) {

            // Place the first queen in the current column of row 0
            board[0][col] = 1;

            // Start solving from the second row
            solved = solveNQueens(board, 1);

            // If no solution is found, remove the first queen
            // and try the next column
            if (!solved)
                board[0][col] = 0;
        }

        // Check whether a solution has been found
        if (solved) {

            // Display the solution heading
            System.out.println("N-Queens Solution:");

            // Loop through all rows of the chessboard
            for (int i = 0; i < N; i++) {

                // Loop through all columns of the current row
                for (int j = 0; j < N; j++) {

                    // Print 1 for a queen and 0 for an empty position
                    System.out.print(board[i][j] + " ");
                }

                // Move to the next line after printing one row
                System.out.println();
            }

        } else {

            // Display this message if no solution exists
            System.out.println("Solution does not exist.");
        }

        // Close Scanner
        sc.close();
    }
}

// This program solves the N-Queens problem using Backtracking.
//
// The N-Queens problem places N queens on an N x N chessboard.
// No two queens should attack each other.
//
// A queen can attack horizontally, vertically and diagonally.
//
// The program places one queen in each row.
// Before placing a queen, it checks whether the position is safe.
//
// It checks three directions:
// 1. Same column.
// 2. Upper left diagonal.
// 3. Upper right diagonal.
//
// If a safe position is found, the queen is placed.
// Then the program recursively tries to place a queen in the next row.
//
// If a solution is not possible, the queen is removed.
// This process is called Backtracking.
//
// Finally, the program displays the chessboard if a solution is found.
