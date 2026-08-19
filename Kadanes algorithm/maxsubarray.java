// public class maxsubarray{
//     public int maxsubarray(int[] nums){
//         int bestending = nums[0];
//         int ans = nums[0];
//         for(int i = 1; i< nums.length ; i++){
//             int v1 = bestending + nums[i];
//             int v2 = nums[i];
//             bestending = Math.max(v1, v2);
//             ans = Math.max(ans, bestending);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//         maxsubarray m = new maxsubarray();
//         System.out.println(m.maxsubarray(nums));
//     }
// }