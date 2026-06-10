// public class maxsum{
//     public static int maxsumsubarray(int k, int[] nums){
//         int n = nums.length;
//         if(k>n){
//             return -1;
//         }
//         int sum = 0;
//         for(int i = 0; i<k; i++){
//             sum += nums[i];
//         }

//         int maxsum = sum;

//         for(int i =k ; i<n ; i++){
//             sum = sum - nums[i-k] + nums[i];
//             maxsum = Math.max(maxsum, sum);
//         }
//         return maxsum;
//     }
//     public static void main(String[] args) {
//         int k = 3;
//         int[] nums = {2,1,5,1,3,2};
//         System.out.println(maxsumsubarray(k, nums));
//     }
// }
