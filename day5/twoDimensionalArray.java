package day5;

public class twoDimensionalArray {
    

    public static void main(String[] args) {
        // Declare and initialize a 2D array with 3 rows and 2 columns
        int[][] numbers = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        // Print the 2D array
        for (int i = 0; i < numbers.length; i++) { // rows
            for (int j = 0; j < numbers[i].length; j++) { // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // move to the next line after each row
        }
    }
}
