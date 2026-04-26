// sliding window
//longest substring without repeating charcter

import java.util.HashSet;
import java.util.*;
public class PRACTICE{
    public int strng(String s){
        int left = 0;
        int maxlen = 0;
        Set <Character> charset = new HashSet<>();
        for(int right = 0 ; right <s.length() ; right++){
            char current = s.charAt(right);

            while(charset.contains(current)){
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(current);
            maxlen = Math.max(maxlen, right - left + 1);
        }
        return maxlen;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        PRACTICE obj = new PRACTICE();
        int k = obj.strng(s);
        System.out.print("length of substring is : " + k);
    }
}