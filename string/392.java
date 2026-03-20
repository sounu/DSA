public class IsSubsequence {

    /**
     * Time Complexity: O(n) - where n is the length of t.
     * Space Complexity: O(1) - we only use two integer pointers.
     */
    public boolean isSubsequence(String s, String t) {
        // An empty string is always a subsequence of any string
        if (s.length() == 0) {
            return true;
        }

        int i = 0; // Pointer for s
        int j = 0; // Pointer for t

        // Iterate through string t
        while (j < t.length()) {
            // If characters match, move the s pointer to the next character
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            // If we've matched all characters in s, we're done!
            if (i == s.length()) {
                return true;
            }

            // Always move the t pointer to keep scanning
            j++;
        }

        // If we finish scanning t and haven't matched all of s, return false
        return false;
    }

    public static void main(String[] args) {
        IsSubsequence solution = new IsSubsequence();

        // Test Case 1
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Test Case 1: " + solution.isSubsequence(s1, t1)); // Expected: true

        // Test Case 2
        String s2 = "axc";
        String t2 = "ahbgdc";
        System.out.println("Test Case 2: " + solution.isSubsequence(s2, t2)); // Expected: false

        // Test Case 3: Empty s
        String s3 = "";
        String t3 = "anythng";
        System.out.println("Test Case 3: " + solution.isSubsequence(s3, t3)); // Expected: true
    }
}