// import java.util.Arrays;
// public class twosum{
//     public int[] twosum(int[] nums, int target){
//         int left = 0;
//         int right = nums.length - 1;
//         while(left < right){
//             int sum = nums[left] + nums[right];
//             if(sum == target){
//                 return new int[]{nums[left], nums[right]};
//             }
//             else if(nums[left] + nums[right] < target){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//         int[] notFound = {-1, -1};
//         return notFound;
//     }
    
//     public static void main(String[] args){
//         int[] nums = new int[]{2,3,7,11};
//         int target = 9;
//         twosum solution = new twosum();
//         System.out.println(Arrays.toString(solution.twosum(nums, target)));
//     }
// }