// public class buyorsell {
//     public int besttimetobuyorsell(int[] prices){
//         int minprice = prices[0];
//         int maxprofit = 0;
//         for(int i = 1; i<prices.length; i++){
//             minprice = Math.min(minprice, prices[i]);
//             int profit = prices[i] - minprice;
//             maxprofit = Math.max(profit, maxprofit);
//         }
//         return maxprofit;
//     }

//     public static void main(String[] args) {
//         buyorsell b = new buyorsell();
//         int[] prices = {7,1,5,3,6,4};
//         System.out.println(b.besttimetobuyorsell(prices));
//     }
// }
