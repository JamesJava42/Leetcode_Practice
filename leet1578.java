public class leet1578 {
    public static void main(String[] args) {
        /*
         * Input: colors = "abc", neededTime = [1,2,3]
Output: 0
Explanation: The rope is already colorful. Bob does not need to remove any balloons from the rope.

colors = "abaac", neededTime = [1,2,3,4,5]
"aaabbbabbbb"  [3,5,10,7,5,3,5,5,4,8,1]
Output: 3
         */

        String s = "aabaa";
        int []t = {1,2,3,4,1};
        int sum=0;
        char []ca = s.toCharArray();
        for(int i=0;i<ca.length-1;i++){
            if(ca[i]==ca[i+1]){
                int mt = Math.min(t[i],t[i+1]);
                sum+=mt;
                ca[i]='n';
                System.out.println(i+" =i" + i+ " = i+1"+ sum+ " =sum");

            }
        }
        System.out.println(sum);
    }
    
}
