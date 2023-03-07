import java.util.ArrayList;
import java.util.List;

public class leet821 {

//     Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.

// The distance between two indices i and j is abs(i - j), where abs is the absolute value function.
    public static void main(String[] args) {
        System.out.println(solveMethod("loveleetcode",'e').toString());
        Integer[] res = solveMethod("loveleetcode",'e');
        System.out.println("exited"+res.length);
        for(int i : res){
            System.out.println("val "+i);
        }
        

        
    }
    public static  Integer[] solveMethod(String s,char c){
        int[] out = new int[s.length()];
        List<Integer> o = new ArrayList<>();

        int si;
        int li;
        si=0;
        li=0;
        int pre=0;
        int post=0;
        int oc=0;


        // while(s.length() != o.size() ){ love(3)le(2)e tcode
                   
                   for(int i=si;i<s.length();i++){
                    if(s.charAt(i) == c){
                        oc++;
                        if(oc ==1){
                            pre=post=i;
                        }
                        int p=post;
                        post=i;
                        pre=p;
                        li=i; //7-11
                        o.add(Math.abs(li-si));
                        for(int j=si;j<=li;j++){
                            out[j]=Math.min(Math.abs(li-j),Math.abs(oc) );   //3210 10 0 43210
                        }
                        si=li+1;
                    }
                   }
        // }
        Integer []o1 = o.toArray(new Integer[0]);
        for(int k : out){
            System.out.print(k);
        }
        return o1;


    }
    
}
