import java.util.Arrays;
public class twosum{
    public int[] twosum(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int sum = nums[left] + nums[right];
            if(sum == target){
                return new int[]{left, right};
            }
            else if(sum < target){  
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};

    }
    public static void main(String[] args){
        int[] nums = new int[]{2,3,7,11};
        int target = 9;
        twosum solution = new twosum();
        System.out.println(Arrays.toString(solution.twosum(nums, target)));
    }
}