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
import java.util.HashSet;
public class PRACTICE{
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        PRACTICE practice = new PRACTICE();
        int[] nums = {1,2,3,4,5,6,2};
        boolean result = practice.containsDuplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}