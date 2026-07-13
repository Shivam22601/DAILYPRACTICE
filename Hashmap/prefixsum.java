
// import java.util.HashMap;
// public class prefixsum{
//     public static int[] prefixsum(int arr[]){
//     HashMap<Integer, Integer> map = new HashMap<>();
//     int sum = 0 ;
//     for(int i = 0 ; i< arr.length ; i++){
//         sum += arr[i];
//         map.put(i, sum);
//     }
//     int prefix[] = new int[arr.length];
//     for(int i = 0 ; i < arr.length ; i++){
//         prefix[i] = map.get(i);
//     }
//     return prefix;
// }

// public static void main(String[] args) {
//     int arr[] = {1, 2, 3, 4, 5};
//     int prefix[] = prefixsum(arr);
//     for(int i = 0 ; i < prefix.length ; i++){
//         System.out.print(prefix[i] + " ");
//     }
// }
// }
