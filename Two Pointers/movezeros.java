public class movezeros{
    public void move(int[] nums){
        int temp = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != 0){
                nums[temp] = nums[i];
                temp++;
            }
        }
        while(temp < nums.length){
            nums[temp] = 0;
            temp++;
        }
        }
        public static void main(String[] args) {
            movezeros m = new movezeros();
            int[] nums = {0, 1, 0, 3, 12};
            m.move(nums);
            for(int i : nums){
                System.out.print(i + " ");
            }
        }
}