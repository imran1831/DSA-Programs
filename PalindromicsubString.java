public class PalindromicsubString {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int start = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromCenter(s, i, i); // odd
            int len2 = expandFromCenter(s, i, i + 1); // even
            int currentMax = Math.max(len1, len2);
            if (currentMax > maxLen) {
                maxLen = currentMax;
                start = i - (currentMax - 1) / 2;
            }
        }
        return s.substring(start, start + maxLen);
    }
    private static int expandFromCenter(String s, int left, int right) {
        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
