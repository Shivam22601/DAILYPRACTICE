import java.util.Arrays;

public class Practice{
   

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
        // int target = 9;
        // System.out.println("Indices: " + result[0] + ", " + result[1]);
        System.out.println("Removed Duplicates: " + Arrays.toString(solution.removeduplicate(nums)));
    }

}