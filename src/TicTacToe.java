public class TicTacToe {

    // Method to validate move
    public static boolean isValidMove(char[][] board, int row, int col) {

        // Check if row and column are within bounds
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // Move is valid
        return true;
    }

    public static void main(String[] args) {

        // Create 3x3 board
        char[][] board = {
                {'X', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', '-'}
        };

        int row = 1;
        int col = 0;

        // Validate move
        boolean valid = isValidMove(board, row, col);

        if (valid) {
            System.out.println("Move Accepted");
        } else {
            System.out.println("Invalid Move");
        }
    }
}