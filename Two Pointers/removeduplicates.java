import java.util.Arrays;

public class removeduplicates {

    public int[] removeduplicate(int[] nums) {

        int i = 0;

        for (int j = 0; j < nums.length; j++) {

            int k;

            // check if nums[j] already exists
            for (k = 0; k < i; k++) {
                if (nums[j] == nums[k]) {
                    break;
                }
            }

            // if not found, add it
            if (k == i) {
                nums[i] = nums[j];
                i++;
            }
        }

        return Arrays.copyOf(nums, i);
    }

    public static void main(String[] args) {

        removeduplicates solution = new removeduplicates();

        int[] nums = {2, 8, 3, 7, 6, 7, 11, 15};

        int[] result = solution.removeduplicate(nums);

        System.out.println("Removed Duplicates: " + Arrays.toString(result));
    }
}