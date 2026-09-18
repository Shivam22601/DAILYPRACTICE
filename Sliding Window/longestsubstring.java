import java.util.HashSet;
import java.util.Set;
public class longestsubstring{
     public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int left = 0;
        
        Set<Character> charSet = new HashSet<>();
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(currentChar);
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        return maxLen;
    }
    public static void main(String[] args) {
        longestsubstring solution = new longestsubstring();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
    }
}