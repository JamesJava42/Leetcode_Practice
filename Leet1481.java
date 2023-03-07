import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Leet1481 {
    public static void main(String[] args) {
        
        /*
         * Given an array of integers arr and an integer k. 
         * Find the least number of unique integers after removing exactly k elements.
         
         Input: arr = [5,5,4], k = 1
Output: 1
Explanation: Remove the single 4, only 5 is left.

Input: arr = [4,3,1,1,3,3,2], k = 3
Output: 2
Explanation: Remove 4, 2 and either one of the two 1s or three 3s. 1 and 3 will be left
 
         */
    int a[]={5,4,3,3,3,2,2,1,1,1};
    int k=2;
    Arrays.sort(a);
    //int max[] = new int [a[a.length]];
    // for(int i=0;i<a.length;i++){
    //       max[a[i]]++;
    // }
    // for(int e : max){
    //     System.out.println(e);
    // }
    Map<Integer,Integer> m = new HashMap<>();
    for(int i=0;i<a.length;i++){
        int val = m.getOrDefault(a[i], 0);
        m.put(a[i], val+1);
    }
    int c=1;
    
    // for(Map.Entry e : m.entrySet()){
    //     System.out.println(e.getKey()+ "  "+ e.getValue());
    // }
    TreeMap<Integer,Integer> o = new TreeMap<>(m);
    List<Integer> go = new ArrayList<>();
    for(Map.Entry e : o.entrySet()){
        System.out.println(e.getKey()+ "  "+ e.getValue());
        int val = (int) e.getValue();
        go.add( val);
    }
    go.sort(Comparator.naturalOrder());
    
    for(int i=0;i<go.size();i++){
        System.out.println("Before  : "+go.get(i));
        if(go.get(i) > k && k!= 0){
            go.set(i, (int) go.get(i) - k);
           
        }
        else {
               if(go.get(i) <= k){
                k=k-go.get(i);
                go.set(i, 0);
               }
        }
        System.out.println("After  : "+go.get(i));
    }
    int ans=0;
    for(int val : go){
        if(val >0){
            ans++;
        }
    }
    System.out.println("Count ans :"+ans);

    }
    
}
