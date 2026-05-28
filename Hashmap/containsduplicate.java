import java.util.HashMap;
public class containsduplicate{
    public static boolean containsduplicate(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                return true;
            }
            map.put(num,0);
        }
        return false;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1};
        boolean result = containsduplicate(nums);
        System.out.println("Contains duplicate: " + result);
    }
}