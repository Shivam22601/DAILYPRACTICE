public class Practice{
     public int maxSubArray(int[] nums) {
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.max(v1, v2);
            ans = Math.max(ans, bestending);
        }
        return ans;
    }

    public int subarraysumk(int[] nums, int k ){
        int bestending = nums[0];
        int ans = nums[0];

        for(int i = 1; i< nums.length; i++){
            if(nums[i] == k) return k;
            int v1 = bestending + nums[i];
            int v2 = nums[i];
            bestending = Math.max(v1, v2);
            ans = Math.max(ans, bestending);
            if(ans == k) return ans;
        }
        return 0;
    }
    public static void main(String[] args) {
        Practice p = new Practice();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(p.maxSubArray(nums));
        System.out.println(p.subarraysumk(nums, -5));
    }

}