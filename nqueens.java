
import java.util.Scanner;

public class nqueens {

    static int N;

    static boolean isSafe(int board[][], int row, int col) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1)
                return false;
        }

        // Check upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {

            if (board[i][j] == 1)
                return false;
        }

        // Check upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < N; i--, j++) {

            if (board[i][j] == 1)
                return false;
        }

        return true;
    }

    static boolean solveNQueens(int board[][], int row) {

        if (row == N)
            return true;

        for (int col = 0; col < N; col++) {

            if (isSafe(board, row, col)) {

                board[row][col] = 1;

                if (solveNQueens(board, row + 1))
                    return true;

                // Backtracking
                board[row][col] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N: ");
        N = sc.nextInt();

        int board[][] = new int[N][N];

        boolean solved = false;
        for (int col = 0; col < N && !solved; col++) {
            board[0][col] = 1;
            solved = solveNQueens(board, 1);
            if (!solved)
                board[0][col] = 0;
        }

        if (solved) {

            System.out.println("N-Queens Solution:");

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

        } else {
            System.out.println("Solution does not exist.");
        }

        sc.close();
    }
}

// The program places the first queen in a possible column of the top row, then
// uses backtracking to place one queen in each remaining row. It checks that no
// queens share a column or diagonal. If a placement fails, it removes that
// queen and tries another position.