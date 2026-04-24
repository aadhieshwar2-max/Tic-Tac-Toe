import java.util.Scanner;

public class TicTacToe {

    // Method to convert slot number into row and column
    public static int[] convertSlotToIndex(int slot) {

        // Convert slot (1-9) to zero-based index
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        // Return row and column as array
        return new int[]{row, col};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read slot number
        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        // Convert slot to row and column
        int[] position = convertSlotToIndex(slot);

        // Display result
        System.out.println("Row Index: " + position[0]);
        System.out.println("Column Index: " + position[1]);
    }
}