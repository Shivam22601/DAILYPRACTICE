public class maxaveragesubarray {
    public double findMaxAverage(int[] nums, int k) {
     int n = nums.length;

        if(k > n) return -1;

        int sum = 0;

        // First window sum
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int maxsum = sum;

        // Sliding window
        for(int i = k; i < n; i++){
            sum = sum - nums[i - k] + nums[i];
            maxsum = Math.max(sum, maxsum);
        }

        return (double) maxsum / k;
    }
    public static void main(String[] args) {
        maxaveragesubarray solution = new maxaveragesubarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(solution.findMaxAverage(nums, k));
    }
}