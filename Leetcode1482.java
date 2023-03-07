import java.util.Arrays;

public class Leetcode1482 {
    public static void main(String[] args) {
        

        /*
         * You are given an integer array bloomDay, an integer m and an integer k.

You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the garden.

The garden consists of n flowers, the ith flower will bloom in the bloomDay[i]
 and then can be used in exactly one bouquet.

Return the minimum number of days you need to wait to be 
able to make m bouquets from the garden. If it is impossible 
to make m bouquets return -1.
Input: bloomDay = [1,10,3,10,2], m = 3, k = 1
Output: 3
Explanation: Let us see what happened in the first three days. x means flower bloomed and _ means flower did not bloom in the garden.
We need 3 bouquets each should contain 1 flower.
After day 1: [x, _, _, _, _]   // we can only make one bouquet.
After day 2: [x, _, _, _, x]   // we can only make two bouquets.
After day 3: [x, _, x, _, x]   // we can make 3 bouquets. The answer is 3.
         */
    

    int bloom[]={1,10,3,10,2};
    
    int nob=3;
    int nof=1;

    while(nob >0){
          sort(bloom);
          if(bloom[0] )


        nob--;
    }

}

    private static int[] sort(int[] bloom) {
        for(int i=0;i<bloom.length;i++){
            int j=i+1;
            while(j < bloom.length){
            if(bloom[i] > bloom[j]){
                int tmp = bloom[i];
                bloom[i]=bloom[j];
                bloom[j]=tmp;

            }
            j++;
        }
        
        }
        return bloom;
    }
}
