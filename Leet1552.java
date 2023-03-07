public class Leet1552 {
    public static void main(String[] args) {
        

        /*
         * In the universe Earth C-137, Rick discovered a special form of magnetic force between two balls 
         * if they are put in his new invented basket. Rick has n empty baskets, 
         * the ith basket is at position[i], Morty has m balls and needs to distribute the 
         * balls into the baskets such that the minimum magnetic force between any two balls is maximum.

Rick stated that magnetic force between two different balls at positions x and y is |x - y|.

Given the integer array position and the integer m. Return the required force.

Input: position = [1,2,3,4,7], m = 3
Output: 3
Explanation: Distributing the 3 balls into baskets 1, 4 and 7 will make the magnetic force 
between ball pairs [3, 3, 6]. The minimum magnetic force is 3. We cannot achieve a 
larger minimum magnetic force than 3.
         */

         int p[]={1,2,3,4,7} ;   //3,5,8,2,4
         int m=3;
         int left =0;
         int right=0;
         for(int ps : p){
            Math.min(left,ps);
            Math.max( right,ps);

         }
         
         m=m-2;

         while(m > 0){
              

            m++;
         }

    }
    
}
