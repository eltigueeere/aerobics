package epam;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null)
            return -1;

        int left = 0, right = 0, max = 0;
        Set<Character> window = new HashSet<>();

        while (right < s.length()) {
            char c = s.charAt(right);
            if (!window.contains(c)) {
                window.add(c);
                right++;
                max = Math.max(max, window.size());
            } else {
                window.remove(s.charAt(left));
                left++;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aabcdde")); // 3
        // System.out.println(lengthOfLongestSubstring("bbbbb")); 
        // System.out.println(lengthOfLongestSubstring("pwwkew")); 
    }
}