import java.util.Arrays;

public class leet2558 {
    public static void main(String[] args) {
        /*You are given an integer array gifts denoting the number of gifts in various piles. Every second,
         you do the following:

Choose the pile with the maximum number of gifts.
If there is more than one pile with the maximum number of gifts, choose any.
Leave behind the floor of the square root of the number of gifts in the pile. Take the rest of the gifts.
Return the number of gifts remaining after k seconds. */


/*Input: gifts = [25,64,9,4,100], k = 4
Output: 29
Explanation: 
The gifts are taken in the following way:
- In the first second, the last pile is chosen and 10 gifts are left behind.
- Then the second pile is chosen and 8 gifts are left behind.
- After that the first pile is chosen and 5 gifts are left behind.
- Finally, the last pile is chosen again and 3 gifts are left behind.
The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29. */

int gifts[]={25,64,9,4,100};
int k=4;
while(k>0){
    Arrays.sort(gifts);
    int val = gifts[gifts.length -1];
    int res =   (int) Math.floor(Math.sqrt(val));
    gifts[gifts.length-1]=res;
    k--;
    
}
int sum=0;
for(int i : gifts){
    sum=sum+i;
}
System.out.print(sum);

    }
    
}
