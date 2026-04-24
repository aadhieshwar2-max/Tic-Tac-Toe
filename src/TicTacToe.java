import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    // Print board
    public static void printBoard(char[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {

                System.out.print(board[i][j]);

                if (j < board[i].length - 1) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < board.length - 1) {
                System.out.println("--+---+--");
            }
        }
    }

    // Validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        return row >= 0 && row < 3 &&
               col >= 0 && col < 3 &&
               board[row][col] == '-';
    }

    // Update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Check win
    public static boolean checkWin(char[][] board, char symbol) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {
                return true;
            }
        }

        // Check columns
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }

    // Check draw
    public static boolean checkDraw(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }

    // Convert slot to row and column
    public static int[] convertSlotToIndex(int slot) {

        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Game state variables
        boolean gameOver = false;

        char currentPlayer = 'X';

        System.out.println("=== Tic-Tac-Toe Game Started ===");

        // Game loop
        while (!gameOver) {

            printBoard(board);

            System.out.println("\nPlayer " + currentPlayer + " Turn");

            // Read slot input
            System.out.print("Enter slot number (1-9): ");
            int slot = scanner.nextInt();

            // Convert slot
            int[] position = convertSlotToIndex(slot);

            int row = position[0];
            int col = position[1];

            // Validate move
            if (isValidMove(board, row, col)) {

                // Update board
                updateBoard(board, row, col, currentPlayer);

                // Check win
                if (checkWin(board, currentPlayer)) {

                    printBoard(board);

                    System.out.println("\nPlayer " + currentPlayer + " Wins!");

                    gameOver = true;
                }

                // Check draw
                else if (checkDraw(board)) {

                    printBoard(board);

                    System.out.println("\nGame Draw!");

                    gameOver = true;
                }

                // Switch turn
                else {

                    if (currentPlayer == 'X') {
                        currentPlayer = 'O';
                    } else {
                        currentPlayer = 'X';
                    }
                }

            } else {

                System.out.println("Invalid Move! Try Again.");
            }
        }

        scanner.close();
    }
}