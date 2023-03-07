import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class leet819 {
    public static void main(String[] args) {
    //     Given a string paragraph and a string array of the banned words banned, return the most frequent word that is not banned. 
    //     It is guaranteed there is at least one word that is not banned, and that the answer is unique.

    /*
    paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]
Output: "ball"
 */
String p = "Bob hit a ball, the hit BALL flew far after it was hit.";
String []b = {"hit"};

    
       getOcurrence(p,b);
      }

      public static int getOcurrence(String p, String[] b){
        String p1;
        
        p1 = p.replaceAll("[,.?]*", "");
        
       String lp =  p1.toLowerCase();
       String  lpo="";
        for(String s : b){
          lpo =  lp.replaceAll(s.toLowerCase().toString(), "");
        }
       // System.out.print(lpo);
        
        //p1.toLowerCase()

        String[] sa = lpo.split(" ");
        for(String s : sa){
            System.out.println("Thes string split :"+s);
        }
        HashMap<String,Integer> res = new HashMap<>();
        for(String st : sa){
            if(res.containsKey(st)){
                int val = res.get(st);
                res.put(st, val+1);

            }else{
                res.put(st, 1);
            }

        }

        int valk = Collections.max(res.values());

        for(Entry<String,Integer> m : res.entrySet()){
            
                System.out.println(m.getKey()+"  --  "+m.getValue());
                //return m.getValue();
            
        }
        return 1;
      }
    
}
