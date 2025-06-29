public class questwosum {

    // Method to find indices of two numbers that add up to target
    public int[] twoSum(int[] nums, int target) {
        // Iterate through each element
        for (int i = 0; i < nums.length; i++) {
            // Check each element after i
            for (int j = i + 1; j < nums.length; j++) {
                // If nums[i] + nums[j] == target, return indices
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // If no valid pair found
        throw new IllegalArgumentException("No two sum solution found");
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create object of the class
        questwosum solver = new questwosum();

        // Example input
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Call twoSum method
        int[] result = solver.twoSum(nums, target);

        // Output result
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
