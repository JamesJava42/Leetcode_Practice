import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Leetcode875
 */
public class Leetcode875 {

    public static void main(String[] args) {
        

        /*
         * Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. 
         * The guards have gone and will come back in h hours.

Koko can decide her bananas-per-hour eating speed of k. Each hour, 
she chooses some pile of bananas and eats k bananas from that pile. 
If the pile has less than k bananas, she eats all of them instead and 
will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.


Input: piles = [30,11,23,4,20], h = 5
Output: 30
         */

        int p[]={30,11,23,4,20}; //4,11,20,23,30   2 8  6,8,9
        int h=6;
        Arrays.sort(p);
        
        int left = 1;
        int right=p[p.length-1];
      
        while(left  < right){
            int k = (left+right)/2;
            System.out.println("Left :"+left+"Right :"+right+"mid :"+k);
            int hours=0;

            for(int i=0;i<p.length;i++){
                    hours = hours + p[i]/k;
                    if(p[i] % k != 0){
                        hours++;
                    }

                System.out.println("hours : "+hours);
            }

            //System.out.println("Total hours : "+hours);

            if(hours <= h){
                right=k;
            }else {
                left=k+1;
            }






        }
        System.out.println("Ans"+left);

        
        



    }
}