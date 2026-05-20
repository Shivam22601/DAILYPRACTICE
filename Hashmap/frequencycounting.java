import java.util.HashMap;
public class frequencycounting{
    public static HashMap<Integer, Integer> frequencycounting(int arr[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        HashMap<Integer, Integer> freq = frequencycounting(arr);
        System.out.println(freq);
    }
}