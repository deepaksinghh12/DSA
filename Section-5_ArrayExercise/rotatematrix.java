/*
------------------Rotate Matrix-------
Given an image represented by an NxN matrix write a method to rotate the image by 90 degrees.
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation. ------------ */

public class rotatematrix {

    // Rotates the matrix 90 degrees clockwise in-place
    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (convert rows to columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap elements in row i from both ends
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }

    // Utility method to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[][] matrix = {
            {1,  2,  3},
            {4,  5,  6},
            {7,  8,  9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate(matrix); // Rotate the matrix in-place

        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);
    }
}
