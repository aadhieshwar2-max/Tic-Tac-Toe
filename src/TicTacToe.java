import java.util.Random;

public class TicTacToe {

    public static void main(String[] args) {

        // Players
        String player1 = "Player 1";
        String player2 = "Player 2";

        // Variables to store symbols and current player
        char player1Symbol;
        char player2Symbol;
        String currentPlayer;

        // Random toss generation
        Random random = new Random();

        // 0 -> Player 1 starts
        // 1 -> Player 2 starts
        int toss = random.nextInt(2);

        // Conditional logic for assigning turns and symbols
        if (toss == 0) {

            currentPlayer = player1;

            player1Symbol = 'X';
            player2Symbol = 'O';

        } else {

            currentPlayer = player2;

            player2Symbol = 'X';
            player1Symbol = 'O';
        }

        // Display results
        System.out.println("===== Tic-Tac-Toe Toss Result =====");

        System.out.println(player1 + " Symbol: " + player1Symbol);
        System.out.println(player2 + " Symbol: " + player2Symbol);

        System.out.println("Starting Player: " + currentPlayer);
    }
}