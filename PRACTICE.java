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
import java.util.HashMap;
public class PRACTICE{
    public int[] twosum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i<nums.length ; i++){
        int remaining = target - nums[i];
        if(map.containsKey(remaining)){
            return new int[]{map.get(remaining),i};
        }
         map.put(nums[i], i);
    }
      return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        PRACTICE practice = new PRACTICE();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = practice.twosum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
 }