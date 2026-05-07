import java.util.Arrays;

public class Practice{
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left < right) {
            int sum = nums[left] + nums[right];
            
            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1}; // Return -1 if no solution is found
    }

    public int[] removeduplicate(int[] nums){
        int i = 0;
        int n = nums.length;
        int j = 1;
        while(j < n){
            if(nums[j] == nums[i]){
                j++;
            }else{     
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return nums;
    }
    
    public static void main(String [] args) {
        Practice solution = new Practice();
        int[] nums = {2,8,3,7,6, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Removed Duplicates: " + Arrays.toString(solution.removeduplicate(nums)));
    }

}