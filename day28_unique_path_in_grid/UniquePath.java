// Unique Paths in a Grid in java using recursion

public class UniquePath {
    
    // Recursive function to find total unique paths
    public static int countPaths(int m, int n) {
        // Base case: if we reach the last row or last column
        if (m == 1 || n == 1) {
            return 1;
        }

        // Recursive case: move either down or right
        return countPaths(m - 1, n) + countPaths(m, n - 1);
    }

    public static void main(String[] args) {
        int m = 3; // rows
        int n = 3; // columns

        int totalPaths = countPaths(m, n);
        System.out.println("\nTotal Unique Paths: " + totalPaths);
    }
}
