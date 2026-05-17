public class merge{
    public int[] merge(int[] num1, int[] num2){
        int[] merged = new int[num1.length + num2.length];
        int temp1 = 0;
        int temp2 = 0;
        for(int i = 0; i < merged.length; i++){
            if(temp1 < num1.length && temp2 < num2.length){
                if(num1[temp1] < num2[temp2]){
                    merged[i] = num1[temp1];
                    temp1++;
                } else {
                    merged[i] = num2[temp2];
                    temp2++;
                }
            } else if(temp1 < num1.length){
                merged[i] = num1[temp1];
                temp1++;
            } else {
                merged[i] = num2[temp2];
                temp2++;
            }
        } 
        return merged;
    }
    public static void main(String[] args) {
        merge m = new merge();
        int[] num1 = {1, 3, 5};
        int[] num2 = {2, 4, 6};
        int[] merged = m.merge(num1, num2);
        for(int i : merged){
            System.out.print(i + " ");
        }
    }
}