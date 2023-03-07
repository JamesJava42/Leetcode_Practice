import java.text.Collator;
import java.util.Arrays;

public class Leetcode238 {
    public static void main(String[] args) {
        

        /*
         * Given an integer array nums, return an array answer such that answer[i]
         *  is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 Input: nums = [1,2,3,4]
Output: [24,12,8,6]
         */

         int n[]={-1,1,0,-3,3};
         int o[] = new int [n.length];
         
         int p=1;
         int count=0;
         for(int i=0;i<n.length;i++){
            
            if( n[i]!=0){
                 p=p*n[i];
            }
            else{
                count++;
            }
         }
         System.out.println("count = "+count+" product = "+p);
         if(count > 1 ){
            System.out.println(o);
         }else if( count == 1){

            for(int i=0;i<n.length;i++){
                if(n[i] != 0){
                    o[i]=0;
                } 
                else{
                    o[i]=p;
                }
            }
         }else{
            int x=0;
            while(x < n.length){
                o[x]=p/n[x];
                x++;
            }
         }
       
        Arrays.stream(o).forEach(x -> System.out.print(x));
    }
    
}
