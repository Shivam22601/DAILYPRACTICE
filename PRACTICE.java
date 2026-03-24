// import java.util.HashMap;
// public class PRACTICE{
    
//     public int[] PRATICE(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i< nums.length; i++){
//             int second = target - nums[i];
//             if(map.containsKey(second)){
//                 return new int[]{ 
//                     map.get(second),i
//                     };
//             }
//                 map.put(nums[i],i);
//             }
//             return new int[]{};
//     }

//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = practice.PRATICE(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }

//contains duplicate
//     public boolean containsDuplicate(int[] nums){
//         HashSet<Integer> set = new HashSet<>();
//         for(int num : nums){
//             if(set.contains(num)){
//                 return true;
//             }
//             set.add(num);
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {1,2,3,4,5,6,2};
//         boolean result = practice.containsDuplicate(nums);
//         System.out.println("Contains duplicate: " + result);
//     }
// }

// single number
// public class PRACTICE{
//     public int singleNumber(int[] nums){
//         int xor = 0;
//         for(int num : nums){
//             xor ^= num;
//         }
//         return xor;
//     }

//     public static void main(String[] atgs){
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {4,1,2,1,2};
//         int result = practice.singleNumber(nums);
//         System.out.println("Single number: " + result);
//     }
// }

//Majority element by two pointers
// public class PRACTICE{
//     public int majorityElement(int[] nums){
//        int element = 0;
//        int count = 0;
//        for (int num : nums){
//         if(count == 0){
//             element = num;
//         }
//         if(num == element){
//             count++;
//         }else{
//             count--;
//         }
//        }
//        return element;
//     }

//     public static void main(String[] atgs){
//         PRACTICE practice = new PRACTICE();
//         int[] nums = {4,1,2,1,2};
//         int result = practice.majorityElement(nums);
//         System.out.println("Majority element: " + result);
//     }
// }

//majority element by hashmap
// import java.util.HashMap;
// public class PRACTICE{
//     public static int majorityElement(int[] nums){
//       HashMap<Integer, Integer> map = new HashMap<>();
//       int n = nums.length;
//     for (int num : nums) {
//             map.put(num, map.getOrDefault(num, 0) + 1);

//             if (map.get(num) > n / 2) {
//                 return num;
//             }
//         }
//        return -1;
//     }

//     public static void main(String[] args){
//         int[] nums = {2, 2, 1, 1, 1, 2, 2};
//         System.out.println(PRACTICE.majorityElement(nums));
//     }
// }
import java.util.*;
public class PRACTICE{
    public static int instersection(int[] nums1, int[] nums2){
      Set<Integer> set1 = new HashSet<>();
      int n = nums1.length;
    for (int num : nums1) {
           set1.add(num);
        }
     Set<Integer> result = new HashSet<>();
    for(int num : nums2){
        if(set1.contains(num)){
            result.add(num);
        }
    }
int[] ans = new int[result.size()];
int index = 0;
for (int val : result){
    ans[index++] = val;
}
return ans[0];
    }

    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(PRACTICE.instersection(nums1, nums2));
    }
}
