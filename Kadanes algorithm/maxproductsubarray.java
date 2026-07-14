public class maxproductsubarray {
    public int maxProduct(int[] nums) {
        int maxending = nums[0];
        int minending = nums[0];
        int ans = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(nums[i] == 0) return 0;
            int v1 = maxending * nums[i];
            int v2 = minending * nums[i];
            maxending = Math.max(v1, Math.max(v2, nums[i]));
            minending = Math.min(v1, Math.min(v2, nums[i]));
            ans = Math.max(ans, maxending);
        }
        return ans;
    }
    public static void main(String[] args) {
        maxproductsubarray p = new maxproductsubarray();
        int[] nums = {2,3,-2,4};
        System.out.println(p.maxProduct(nums));
    }

}