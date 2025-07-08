public class SudokuProblem {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        char ch = (char)(number + '0');
        
        // Row and column check
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch || board[row][i] == ch) {
                return false;
            }
        }

        // 3x3 grid check
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {
        // Base case: reached end of board
        if (row == 9) {
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if (col != 8) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '0') {
            return helper(board, nrow, ncol);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char)(i + '0');
                    if (helper(board, nrow, ncol)) {
                        return true;
                    }
                    board[row][col] = '0'; // backtrack
                }
            }
        }

        return false;
    }

    public void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char ch : row) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '0', '0', '7', '0', '0', '0', '0'},
            {'6', '0', '0', '1', '9', '5', '0', '0', '0'},
            {'0', '9', '8', '0', '0', '0', '0', '6', '0'},
            {'8', '0', '0', '0', '6', '0', '0', '0', '3'},
            {'4', '0', '0', '8', '0', '3', '0', '0', '1'},
            {'7', '0', '0', '0', '2', '0', '0', '0', '6'},
            {'0', '6', '0', '0', '0', '0', '2', '8', '0'},
            {'0', '0', '0', '4', '1', '9', '0', '0', '5'},
            {'0', '0', '0', '0', '8', '0', '0', '7', '9'}
        };

        SudokuProblem sp = new SudokuProblem();
        if (sp.helper(board, 0, 0)) {
            System.out.println("Solved Sudoku:");
            sp.printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
