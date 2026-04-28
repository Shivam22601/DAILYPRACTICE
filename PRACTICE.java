// two pointers

//two sum
// public class PRACTICE{
//     public int[] twosum(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;
//         while (left < right) {
//             int sum = nums[left] + nums[right];
//             if (sum == target) {
//                 return new int[]{left, right};
//             } else if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }
//         return new int[]{-1, -1}; // not found
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.twosum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
//  }


// public class PRACTICE{
//     public int[] twosum(int[] nums, int target) {
//       for(int i =0; i< nums.length; i++){
//         for(int j = i+1; j< nums.length; j++){
//             if(nums[i] + nums[j] == target){
//                 return new int[]{i, j};
//             }
//         }
//       }
//       return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.twosum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
//  }

// public class PRACTICE{
//     public int[] twosum(int[] nums, int target) {
//       for(int i =0; i< nums.length; i++){
//         for(int j = i+1; j< nums.length; j++){
//             if(nums[i] + nums[j] == target){
//                 return new int[]{i, j};
//             }
//         }
//       }
//       return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.twosum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
//  }
// import java.util.HashMap;
// public class PRACTICE{
//     public int[] twosum(int[] nums, int target) {
//     HashMap<Integer, Integer> map = new HashMap<>();
//     for(int i = 0; i<nums.length ; i++){
//         int remaining = target - nums[i];
//         if(map.containsKey(remaining)){
//             return new int[]{map.get(remaining),i};
//         }
//          map.put(nums[i], i);
//     }
//       return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.twosum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
//  }


// first unique char in a string

public class PRACTICE{
    public int firstunique(String s){
        int[] freq = new int[26];

        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        for(int i= 0; i <s.length() ; i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PRACTICE practice = new PRACTICE();
        String s = "leetcode";
        int result = practice.firstunique(s);
        System.out.println("First unique character index: " + result);
    }
}