class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        java.util.Arrays.sort(charS);
        java.util.Arrays.sort(charT);
        return java.util.Arrays.equals(charS, charT);
    }
}