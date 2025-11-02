public class VowelConsonantCount {
    public static void main(String[] args) {
        // 1. Define the input string.
        String str = "Deepak Singh"; 
        
        // 2. Convert the entire string to lowercase. 
        // This is a crucial first step: it simplifies the logic inside the loop 
        // because we only have to check for 'a', 'e', 'i', 'o', 'u' 
        // instead of checking for both 'A' and 'a', 'E' and 'e', etc.
        str = str.toLowerCase(); 

        // 3. Initialize counters. These variables will store the final counts.
        int vowels = 0, consonants = 0; 

        // 4. Start the single-pass loop. 
        // This loop iterates through every character in the processed string.
        // The Time Complexity is O(n), where n is the length of the string, which is very fast.
        for (int i = 0; i < str.length(); i++) {
            
            // Get the character at the current index i.
            char ch = str.charAt(i); 

            // 5. The primary filter: Check if the character is a lowercase English letter ('a' through 'z').
            // This ignores spaces, punctuation, numbers, and any other non-alphabetic characters.
            if (ch >= 'a' && ch <= 'z') { 
                
                // 6. Secondary check: If it's a letter, check if it's a vowel.
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    // If it matches any of the vowels, increment the vowel counter.
                    vowels++; 
                
                else 
                    // 7. If it's a letter BUT NOT a vowel, it must be a consonant.
                    // Increment the consonant counter.
                    consonants++; 
            }
            // If the character is not a letter (e.g., a space ' ' in "Deepak Singh"), 
            // the entire 'if' block is skipped, and the loop moves to the next character.
        }

        // 8. Output the final results.
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}