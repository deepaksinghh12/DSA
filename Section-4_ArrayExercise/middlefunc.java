import java.util.Arrays;

public class middlefunc {
    public static int[] middle(int[] arr) {
        if (arr.length <= 2) {
            return new int[0]; // Return empty array if there are no middle elements
        }
        return Arrays.copyOfRange(arr, 1, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4};
        int[] result = middle(myArray);
        System.out.println(Arrays.toString(result)); // Output: [2, 3]
    }
}