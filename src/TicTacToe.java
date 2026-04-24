public class TicTacToe {

    // Method to check winner
    public static boolean checkWinner(char[][] board, char symbol) {

        // Check all rows
        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol) {

                return true;
            }
        }

        // Check all columns
        for (int j = 0; j < 3; j++) {

            if (board[0][j] == symbol &&
                board[1][j] == symbol &&
                board[2][j] == symbol) {

                return true;
            }
        }

        // Check main diagonal
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {

            return true;
        }

        // Check opposite diagonal
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {

            return true;
        }

        // No winner found
        return false;
    }

    public static void main(String[] args) {

        // Sample board
        char[][] board = {
                {'X', 'X', 'X'},
                {'O', '-', 'O'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X';

        // Check winner
        boolean winner = checkWinner(board, currentPlayer);

        if (winner) {
            System.out.println("Player " + currentPlayer + " Wins!");
        } else {
            System.out.println("No Winner Yet.");
        }
    }
}