public class findmin{
    public int findmin(int[] nums){
        int low = 0;
        int n = nums.length;
        int high = n-1;

        while(low < high){
            int mid = low + (high - low)/2;

            if(nums[mid] > nums[high] ){
                low = mid +1;
            }else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        findmin obj = new findmin();
        int[] nums = {3,4,5,1,2};
        int min = obj.findmin(nums);
        System.out.println("The minimum element in the array is: " + min);
    }
}