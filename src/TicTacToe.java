public class TicTacToe {

    // Method to place symbol on board
    public static void updateBoard(char[][] board, int row, int col, char symbol) {

        // Update board with symbol
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

    public static void main(String[] args) {

        // Create board
        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        // Move details
        int row = 1;
        int col = 1;
        char symbol = 'X';

        // Update board
        updateBoard(board, row, col, symbol);

        // Display updated board
        System.out.println("Updated Tic-Tac-Toe Board:");
        printBoard(board);
    }
}