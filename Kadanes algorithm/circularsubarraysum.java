// public class circularsubarraysum{
//     public int circularsubarraysum(int[] nums){
//         int totalsum = 0;
//         int currsum = nums[0];
//         int maxsum = 0;
//         int currmin = nums[0];
//         int minsum = 0;
//         for(int num : nums){
//             currsum = Math.max(currsum + num, num);
//             maxsum = Math.max(maxsum, currsum);
//             currmin = Math.min(currmin + num, num);
//             minsum = Math.min(minsum, currmin);
//             totalsum += num;
//         }
//         if(totalsum < 0) return maxsum;
//         return Math.max(maxsum, totalsum - minsum);
//     }
//     public static void main(String[] args) {
//         int[] nums = {5,-3,-3,5,5};
//         circularsubarraysum c = new circularsubarraysum();
//         System.out.println(c.circularsubarraysum(nums));
// }
// }
