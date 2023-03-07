import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leet474 {
    public static void main(String[] args) {
        
        /*
         * Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
Output: 4
Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4.
Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}.
{"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.



You are given an array of binary strings strs and two integers m and n.

Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
["10","0001","111001","1","0"] m-4 n-3
         */
         List<String> l = new ArrayList<>();



         String []s = {"10","0001","111001","1","0"};  //2
         final  int m=4;
         final int n=3;
         String st="";
         int max =0;
         for(int i=0;i<s.length;i++){
            st =st+s[i];                //0 - "10"
            for(int j=i;j<s.length;j++){

                st = st+s[j];           //0 - "100"
                int sum = count(st,m,n);    //0 - 
             System.out.println("itr :"+i+" - j :"+j +" sun :"+sum  + "String :"+st);
                if(sum >= m+n){
                    int c=0;
                    for(int p=i;p<j;p++){
                        
                        c++;
                       


                    }
                    max = Math.max(max, c);
                    

                }
               

            }
            st="";
         }
         System.out.println(" max " +max);
    }
    public static int  count(String s,int m,int n ){
       
        int val = Integer.parseInt(s,2);
        
        int c0=0;
        int c1= countZerosOnes(val,m,n);
        if(c1==0){
            c0++;
        }
        c0=s.length()-c1;
        System.out.println("0's : " +c0+ " 1's : "+c1 + " String is "+s);
        //for(int i=0;i<ci.length;i++){
            if(c1>= n && c0 >= m){
                return c0+c1;

            }
           
           return 0;

        }

        
    
    public static int countZerosOnes(int val,int m,int n){
        if(val == 0){
            return 0;
        }
        int count=0;
        while(val > 0){
            val=val & (val-1);
            count++;
        }
        return count;
       
    }
    
}
