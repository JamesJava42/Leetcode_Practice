public class leet123 {
    public static void main(String[] args) {
        /*
         * You are given an array prices where prices[i] is the price of a given stock on the ith day.

         Find the maximum profit you can achieve. You may complete at most two transactions.

             Note: You may not engage in multiple transactions simultaneously 
             (i.e., you must sell the stock before you buy again).


             Input: prices = [3,3,5,0,0,3,1,4]
             Output: 6
Explanation: Buy on day 4 (price = 0) and sell on day 6 (price = 3), profit = 3-0 = 3.
Then buy on day 7 (price = 1) and sell on day 8 (price = 4), profit = 4-1 = 3.
         */

         int[] p = {3,3,5,0,0,3,1,4};
         int buy=p[0];
         int sell=p[0];
         
         int ans = 0;
        int sb=1;
        int sc=0;
        boolean check=true;

         for(int i=1;i<p.length;i++){   //[3,3,5,0,0,3,1,4]
            
                if(p[i] < buy ){
                    sb++;
                    if(!check){
                        buy=sell=p[i];
                        check=true;
                    ans=Math.max(ans, buy-sell);

                    }
                    

                }
                else if(p[i] > sell ){
                    sc--;
                    sell=p[i];
                    check=false;
                    ans=Math.max(ans, sell-buy);
                }

         }

System.out.println(ans);

         
    }
    
}
