// two pointers

//two sum
public class PRACTICE{
    public int[] twosum(int[] nums, int target) {
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
        return new int[]{-1, -1}; // not found
    }

    public static void main(String[] args) {
        PRACTICE practice = new PRACTICE();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = practice.twosum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
 }