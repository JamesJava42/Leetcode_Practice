public class Leet1011 {
    public static void main(String[] args) {
        /*
         * A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. 
Each day, we load the ship with packages on the conveyor belt 
(in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the
 packages on the conveyor belt being shipped within days days.

 Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
         */

         int w[]= {3,2,2,4,1,4};
         int days = 3;

         int left =0;
         int right=0;
         for(int we : w){
            left = Math.max(we,left);
            right+=we;
         }
        System.out.println(left+ "   "+right);


         while( left < right){

             
              int mid_cap = (left+right)/2;
              System.out.println(left+ " --" + right+ " mid :"+mid_cap);

              int day=1;
              int cur_we=0;
              for(int wei : w){
                 if(cur_we+wei > mid_cap)
                 {
                       day++;
                       cur_we=0;
                }
                cur_we+=wei;
            }
            if(day > days){
                left=mid_cap+1;
             }else{
                right=mid_cap;
             }
    

         }
         System.out.println("left :"+left+"right :"+right);
         
    }
    
}
