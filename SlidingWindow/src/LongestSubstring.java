//Find length of the longest substring without repeating characters
import java.util.HashSet;

public class LongestSubstring {

    public static int longestSubstring(String s) {

        int left = 0;
        int maxLen = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Remove duplicates from left
            while (set.contains(ch)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {

        String s = "cadbzabcd";

        System.out.println(longestSubstring(s));
    }
}