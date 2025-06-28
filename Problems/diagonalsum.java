public class diagonalsum {
    // Method to calculate sum of both diagonals without double-counting the center
    public static int sumDiagonalElements(int[][] array) {
        int n = array.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += array[i][i];           // Primary diagonal
            sum += array[i][n - 1 - i];   // Secondary diagonal
        }

        // Subtract center element if matrix size is odd (it gets counted twice)
        if (n % 2 == 1) {
            sum -= array[n / 2][n / 2];
        }

        return sum;
    }

    // Main method to test the logic
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = sumDiagonalElements(matrix);
        System.out.println("Sum of both diagonals (no double-count): " + result);
    }
}
