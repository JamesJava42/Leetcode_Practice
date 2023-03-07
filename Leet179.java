import java.util.Arrays;
import java.util.Comparator;

public class Leet179 {

    public static void main(String[] args) {
        
        /**
         * Given a list of non-negative integers nums, arrange them such 
         * that they form the largest number and return it.

Since the result may be very large, 
so you need to return a string instead of an integer.

 Input: nums = [10,2]
Output: "210"
         */

         int n[] = {10,2,6,16};
        
         String s_n[] = new String[n.length];
         //we are converted the integer value array to the String array
         for(int i=0;i<s_n.length;i++){
            s_n[i]=String.valueOf(n[i]);
         }

         Comparator<String> strcomp = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
                return s2.compareTo(s1);
            }
            
         }; 
         //arrainging the string inside the array based on the higest values
        Arrays.sort(s_n, strcomp);
        StringBuilder sb = new StringBuilder();
        for (String string : s_n) {
            sb.append(string);
            
        }
        System.out.println(sb.toString());

         
    }
    
}
