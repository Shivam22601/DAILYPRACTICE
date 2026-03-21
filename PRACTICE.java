import java.util.HashMap;
public class PRACTICE{
    
    public int[] PRATICE(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            int second = target - nums[i];
            if(map.containsKey(second)){
                return new int[]{ 
                    map.get(second),i
                    };
            }
                map.put(nums[i],i);
            }
            return new int[]{};
    }

    public static void main(String[] args) {
        PRACTICE practice = new PRACTICE();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = practice.PRATICE(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}

hi