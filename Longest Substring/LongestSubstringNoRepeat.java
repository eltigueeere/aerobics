public class LongestSubstringNoRepeat {
    public static int lengthOfLongestSubstring(String s) {
        StringBuilder window = new StringBuilder();
        int maxLength = 0;

        for (char c : s.toCharArray()) {
            int index = window.indexOf(String.valueOf(c));
            if (index != -1) {
                window.delete(0, index + 1);  
            }
            window.append(c);
            maxLength = Math.max(maxLength, window.length());
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String input = "abcabcbb";
        int result = lengthOfLongestSubstring(input);
        System.out.println("Longest substring length: " + result);
    }
}
