// import java.util.HashMap;
// public class majorityelement{
//     public int majority(int[] nums){
//       HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i = 0; i < nums.length; i++) {

//             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

//             // check majority
//             if(map.get(nums[i]) > nums.length / 2) {
//                 return nums[i];
//             }
//         }

//         return -1;
// }

// public static void main(String[] args) {
//     majorityelement solution = new majorityelement();
//     int[] nums = {3, 2, 3};
//     int result = solution.majority(nums);
//     System.out.println("Majority element: " + result);
// }
// }