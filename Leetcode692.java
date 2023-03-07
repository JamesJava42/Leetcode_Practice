import java.util.HashMap;
import java.util.Map;

public class Leetcode692 {

    public static void main(String[] args) {
        
       /*
        *  Input: words = ["i","love","leetcode","i","love","coding"], k = 2
Output: ["i","love"]
Explanation: "i" and "love" are the two most frequent words.
Note that "i" comes before "love" due to a lower alphabetical order.
        */
        String []s = {"i","love","leetcode","i","love","coding"};
        int k=2;
        Map<String,Integer> res = new HashMap<>();
        for(String str : s){
            if(res.containsKey(str)){
                int val = res.get(str);
                res.put(str, val+1);

            }else{
                res.put(str, 1);
            }
        }
        
    }
    
}
