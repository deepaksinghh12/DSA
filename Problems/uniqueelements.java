// No imports needed since we are not using any collections

// Main class
public class uniqueelements {

    // Method to check if all elements in the array are unique
    public boolean isUnique(int[] nums) {
        int n = nums.length;

        // Compare every element with every other element
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found, return false
                if (nums[i] == nums[j]) {
                    return false; // Not unique
                }
            }
        }

        // If no duplicates were found
        return true;
    }

    // Main method: entry point of the program
    public static void main(String[] args) {
        // Create an object to call the method
        uniqueelements ex = new uniqueelements();

        // Test array 1: all elements are unique
        int[] array1 = {1, 2, 3, 4, 5, 6};

        // Test array 2: has a duplicate (1)
        int[] array2 = {1, 2, 3, 4, 1};

        // Print results
        System.out.println(ex.isUnique(array1)); // Expected: true
        System.out.println(ex.isUnique(array2)); // Expected: false
    }
}
//Done Again