import java.util.*;

public class Main {

    static class Solution {
        public boolean isValidSudoku(char[][] board) {
            Set<String> seen = new HashSet<>();

            for (int i = 0; i < 9; ++i) {
                for (int j = 0; j < 9; ++j) {
                    if (board[i][j] == '.')
                        continue;

                    final char c = board[i][j];

                    if (!seen.add(c + "@row" + i) || 
                        !seen.add(c + "@col" + j) || 
                        !seen.add(c + "@box" + i / 3 + j / 3)) {
                        return false;
                    }
                }
            }

            return true;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example Sudoku board
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean result = solution.isValidSudoku(board);
        System.out.println("Is the Sudoku board valid? " + result);
    }
}
