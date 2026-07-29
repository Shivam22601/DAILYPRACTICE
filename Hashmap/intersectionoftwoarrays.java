import java.util.HashSet;
public class intersectionoftwoarrays{
    public int[] solution(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums1){
            set.add(num);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num)){
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int index = 0;
        for(int num : intersection){
            result[index++] = num;
        }
        return result;
    }

    public static void main(String[] args) {
        intersectionoftwoarrays solution = new intersectionoftwoarrays();
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] result = solution.solution(nums1, nums2);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}