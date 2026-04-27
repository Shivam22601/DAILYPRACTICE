// sliding window
//longest substring without repeating charcter

// import java.util.HashSet;
// import java.util.*;
// public class PRACTICE{
//     public int strng(String s){
//         int left = 0;
//         int maxlen = 0;
//         Set <Character> charset = new HashSet<>();
//         for(int right = 0 ; right <s.length() ; right++){
//             char current = s.charAt(right);

//             while(charset.contains(current)){
//                 charset.remove(s.charAt(left));
//                 left++;
//             }
//             charset.add(current);
//             maxlen = Math.max(maxlen, right - left + 1);
//         }
//         return maxlen;
//     }

//     public static void main(String[] args) {
//         String s = "abcabcbb";
//         PRACTICE obj = new PRACTICE();
//         int k = obj.strng(s);
//         System.out.print("length of substring is : " + k);
//     }
// }


//maximum sum subarray
public class PRACTICE{
    public static int maxSumSubarray(int[] arr, int k){
        int maxSum = 0;
        int windowSum = 0;
        for(int i = 0 ; i<k ; i++){
            windowSum += arr[i];
        }
        maxSum = windowSum;
        for(int i = k; i<arr.length ; i++){
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(maxSum , windowSum);
        }
        return maxSum;
    }


    public static void main(String[] args){
         int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        System.out.println(maxSumSubarray(arr, k));
    }
}