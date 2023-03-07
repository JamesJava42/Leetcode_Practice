import java.util.Arrays;

public class Leet2226 {
    public static void main(String[] args) {
        
/*
 * 
 * You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies
 *  of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge 
 * two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that
 each child gets the same number of candies. Each child can take at most one pile of candies and 
 some piles of candies may go unused.

Return the maximum number of candies each child can get.


Input: candies = [5,8,6], k = 3
Output: 5
Explanation: We can divide candies[1] into 2 piles of size 5 and 3, and candies[2]
 into 2 piles of size 5 and 1. We now have five piles of candies of sizes 5, 5, 3, 5, 
 and 1. We can allocate the 3 piles of size 5 to 3 children. It can be proven that
  each child cannot receive more than 5 candies.
 */
  
int a[]={5,8,6};
int k=3;
Arrays.sort(a);  //5,6,8
int left = 1;
int right=a[a.length-1]+1;
int ans=0;
int s=0;

System.out.println((int)(4/2));
System.out.println((int)(5/2));

while(left < right){
       
    int mid = (left+right)/2;

    int cans=0;
    
    for(int i : a){
        

          cans+=(int)Math.floor((double)(i/mid)); //2.
          System.out.println("Inside loop : "+cans);
    }
    System.out.println("Left :"+left+ "Right :"+right+ " cans :"+cans+ "mid :"+ mid);

    if(cans >= k){
        ans = mid;
        left=mid+1;

    }else{
        right=mid;
    }


}
System.out.println(ans);


        
}


    }
    

