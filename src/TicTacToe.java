public class TicTacToe {

    public static void main(String[] args) {

        // Create 3x3 board
        char[][] board = new char[3][3];

        // Initialize board with '-'
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '-';
            }
        }

        // Print board
        System.out.println("Empty Tic-Tac-Toe Board:");

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
}