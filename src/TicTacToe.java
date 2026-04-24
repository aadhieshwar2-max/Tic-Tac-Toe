import java.util.Random;

public class TicTacToe {

    // Method to check if move is valid
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Boundary check
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Cell must be empty
        return board[row][col] == '-';
    }

    // Method to update board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {
        board[row][col] = symbol;
    }

    // Method to print board
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

    // Method for computer move
    public static void computerMove(char[][] board, char computerSymbol) {

        Random random = new Random();

        int row;
        int col;
        int slot;

        // Loop until valid move is found
        while (true) {

            // Generate random slot from 1-9
            slot = random.nextInt(9) + 1;

            // Convert slot to row and column
            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

            // Validate move
            if (isValidMove(board, row, col)) {

                // Place symbol
                updateBoard(board, row, col, computerSymbol);

                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'X', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', '-'}
        };

        System.out.println("Board Before Computer Move:");
        printBoard(board);

        // Computer makes move
        computerMove(board, 'X');

        System.out.println("\nBoard After Computer Move:");
        printBoard(board);
    }
}