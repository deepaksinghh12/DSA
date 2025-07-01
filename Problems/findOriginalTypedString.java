public class findOriginalTypedString {

    // Method to count consecutive duplicate characters
    public static int possibleStringCount(String word) {
        int ans = 1; // Start with 1 by default
        for (int i = 1; i < word.length(); ++i) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                ++ans;
            }
        }
        return ans;
    }

    // Main method to run the program
    public static void main(String[] args) {
        String testWord = "aabbba";
        int result = possibleStringCount(testWord);
        System.out.println("Input: " + testWord);
        System.out.println("Output (consecutive same characters count + 1): " + result);
    }
}
// This code counts the number of consecutive duplicate characters in a string