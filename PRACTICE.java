//Kadanes algorithm
//
// maximum sum subarray

// public class PRACTICE{
//     public int maxsubarray(int[] nums){
//         int bestending = nums[0];
//         int ans = nums[0];

//         for(int i = 1; i< nums.length; i++){
//             int v1 = bestending + nums[i];
//             int v2 = nums[i];
//             bestending = Math.max(v1, v2);
//             ans = Math.max(ans, bestending);
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//         PRACTICE p = new PRACTICE();
//         System.out.println(p.maxsubarray(nums));
//     }
// }

// subarray sum equals k

public class PRACTICE{
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;

            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];

                if (currentSum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        PRACTICE p = new PRACTICE();
        System.out.println(p.subarraySum(nums, k));
    }
}