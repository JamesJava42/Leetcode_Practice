public class leet121 {
    public static void main(String[] args) {
        
        /*You are given an array prices where prices[i] is the price of a given stock on the ith day.

         You want to maximize your profit by choosing a single day to buy one stock and choosing a different 
         day in the future to sell that stock.

        Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
        
        Input: prices = [7,1,5,3,6,4], [7,6,4,3,1]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
  */

  int[] prices = {7,1,5,3,6,4};//0,1,2,3,4,5
  int min =prices[0];
  int max=prices[0];

  int minind=0;
  int maxind=0;

  for(int i=1;i<prices.length-1;i++){
    if( prices[i] < min){
      min=prices[i];
      minind=i;
      max=prices[i];

    }
    else{
      if(max < prices[i]){
        max=prices[i];
        maxind=i;
      }
    }

  }
  System.out.println(" min : "+min + "max :"+max+ "--> "+ (max-min));


//   for(int i=0;i<prices.length;i++){
//     if(prices[i] > min){
//         max=prices[i];
//         maxind=i;
//     }
//     min=prices[i];
//     minind=i;

//   }

//   if(minind < maxind){
//     System.out.println()

//   }
    }
    
}
