class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; // Different lengths, not anagrams
        }

        int[] charCount = new int[26]; // Assuming lowercase English letters

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++; // Increment count for each character in s
        }

        for (char c : t.toCharArray()) {
            charCount[c - 'a']--; // Decrement count for each character in t
            if (charCount[c - 'a'] < 0) {
                return false; // Found extra occurrence of a character
            }
        }

        return true; // All characters match
    }
}