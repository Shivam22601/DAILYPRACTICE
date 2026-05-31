public class mountain{
    public boolean peak(int[] arr){
        int n = arr.length;
        if (n < 3) {
            return false;
        }
        int low = 0 ;
        int high = n - 1;
        while(low + 1 < high && arr[low] < arr[low + 1]){
            low++;
        }
        while(high > 0 && arr[high] < arr[high - 1]){
            high--;
        }

        if(low > 0 && high < n-1 && high == low){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        mountain m = new mountain();
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        System.out.println(m.peak(arr)); // Output: true
    }
}
//solvedby using binary search approach in which we use two pointers as low and high to traverse the array from both ends and check if the elements are in increasing order from the left and decreasing order from the right. If we find a point where low and high meet and both conditions are satisfied, then we can conclude that the array is a mountain array.