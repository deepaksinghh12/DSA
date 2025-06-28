public class primarydiagonals {
    // Method to calculate primary diagonal sum
    public static int sumDiagonalElements(int[][] array) {
        int sum = 0;
        int numRows = array.length;

        for (int i = 0; i < numRows; i++) {
            sum += array[i][i]; // Sum of primary diagonal
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int result = sumDiagonalElements(array);
        System.out.println("Sum of primary diagonal elements: " + result);
    }
}
