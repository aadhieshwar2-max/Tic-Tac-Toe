public class TicTacToe {

    // Method to check if game is a draw
    public static boolean checkDraw(char[][] board) {

        // Traverse entire board
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                // If empty cell exists, game is not a draw
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }

        // No empty cells found
        return true;
    }

    public static void main(String[] args) {

        // Sample board with no empty cells
        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        // Check draw condition
        boolean draw = checkDraw(board);

        if (draw) {
            System.out.println("Game Draw!");
        } else {
            System.out.println("Moves Still Available.");
        }
    }
}