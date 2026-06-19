// import java.util.HashMap;
// public class twosum{
//     public static int[] twosum(int[] nums, int target){
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length ; i++){
//             int remaining = target - nums[i];
//             if(map.containsKey(remaining)){
//                 return new int[]{remaining, nums[i]};
//             }
//             map.put(nums[i], i);
//         }
//         return new int[]{-1, -1};
//     }
//     public static void main(String[] args){
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = twosum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }