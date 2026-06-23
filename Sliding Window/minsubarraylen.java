public class minsubarraylen{
    public int minsubarraylen(int target, int[] nums){

        int n = nums.length;
        int min_len = Integer.MAX_VALUE;
        int low = 0;
        int sum = 0;
        for(int high = 0 ; high <nums.length; high++){
            sum += nums[high];
            while(sum >= target){
                min_len = Math.min(min_len, high - low + 1);
                sum -= nums[low];
                low++;
            }
        }
        if(min_len == Integer.MAX_VALUE){
            return 0;
        }else{
            return min_len;
        }
    }
    public static void main(String[] args) {
        minsubarraylen obj = new minsubarraylen();
        int target = 7;
        int[] nums = {2,3,1,2,4,3};
        System.out.println(obj.minsubarraylen(target, nums));        
    }
}
