import java.util.Arrays;

public class Leet646 {
    public static void main(String[] args) {
        

        /*
         * You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.

A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.

Return the length longest chain which can be formed.

You do not need to use up all the given intervals. You can select pairs in any order.


Input: pairs = [[1,2],[2,3],[3,4]]
Output: 2
Explanation: The longest chain is [1,2] -> [3,4].

Input: pairs = [[1,2],[7,8],[4,5]]
Output: 3
Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].

[[-6,9],[1,6],[8,10],[-1,4],[-6,-2],[-9,8],[-5,3],[0,3]]
         */


         int [][]pairs={
            {-6,9},{1,6},{8,10},{-1,4},{-6,-2},{-9,8},{-5,3},{0,3}
         };

         //Arrays.sort(pairs, (a, b) -> a[0]-b[0]);
         Arrays.sort(pairs, (a, b) -> a[1]-b[1]);
        
        int val = pairs[0][1];
         int idx=1;
         int c=0;
         while(idx <pairs.length){
            int val1 = pairs[idx][0];
            if(val < val1){
                val=pairs[idx][1];
                c++;
            }
            idx++;
            }

         
      System.out.println(c+1); 
    
    
    
}
}
