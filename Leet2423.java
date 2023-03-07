import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Leet2423 {
    public static void main(String[] args) {
        

        /*
         * You are given a 0-indexed string word, consisting of lowercase English letters. You need to select one index and remove the letter at that index from word so that the frequency of every letter present in word is equal.

Return true if it is possible to remove one letter so that the frequency of all letters in word are equal, and false otherwise.

Note:

The frequency of a letter x is the number of times it occurs in the string.
You must remove exactly one letter and cannot chose to do nothing.
Input: word = "abcc"
Output: true
Explanation: Select index 3 and delete it: word becomes "abc" and each character has a frequency of 1.
         */

         String s = "abcc";


         Map<Character,Integer> obj = new HashMap<>();


         for(int i=0;i<s.length();i++){
            if(obj.containsKey(s.charAt(i))){
                int val = obj.get(s.charAt(i));
                obj.put(s.charAt(i),val+1);
            }else{
                obj.put(s.charAt(i), 1);
            }
         }



         Map<Character,Integer> cobj = obj;

         
         for(Map.Entry<Character,Integer> ele : cobj.entrySet()){
            System.out.println(ele.getKey()+ "   "+ele.getValue());

         } 
         

         for(Map.Entry<Character,Integer>  e : cobj.entrySet() ){
          
           
            Map<Character,Integer> cc = cobj;
            // for(Map.Entry<Character,Integer> ele : cc.entrySet()){
            //     System.out.println(ele.getKey()+ "   "+ele.getValue());
    
            //  } 
            int val = e.getValue()-1;
            cc.put(e.getKey(), val);
            
            if( val<=0){
                cc.remove(e.getKey());
            }
            Set<Integer> sobj=new HashSet<Integer>();
            

            for(Map.Entry<Character,Integer> res : cc.entrySet()) {
                sobj.add(res.getValue());
                System.out.print("  obj add in set : "+sobj.add(res.getValue())+ "value :"+res.getValue());
            }
            System.out.println();
            System.out.println(e.getKey() + "  -- "+e.getValue() +" Val :---  "+val+ "sizeset  -- "+sobj.size());
            if(sobj.size()==1){
                System.out.println("true");
            }


         }
    }
    
}
