import java.util.PriorityQueue;
public class practice{

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            // Keep only k largest elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Top of min heap = kth largest element
        return pq.peek();
    }

    public static void main(String[] args){
        practice p = new practice();
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(p.findKthLargest(nums, k)); // Output: 5
    }
}
