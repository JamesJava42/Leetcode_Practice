import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Leet925 {
    public static void main(String[] args) {
        
        /*
         * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, 
         * the key might get long pressed, and the character will be typed 1 or more times.

You examine the typed characters of the keyboard. 
Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
         */


          /*
           * Input: name = "alex", typed = "aaleex"
Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.
           */


           String s = "alex";
           String t="aaleex";
           System.out.println(check(s,t));
        

           
   
    
}

public static boolean check(String s , String t){
     int n = s.length();
     int m = t.length();
     int i=0;
     int j=0;

     if(m < n){
        return false;
     }

     if(s.charAt(0) != t.charAt(0)) return false;

    while(i < n && j < m){    //name = "ale x", typed = "aale e x"
    System.out.println("i : "+i +"  -- > "+s.charAt(i)+ "  j :"+j + " -->"+t.charAt(j)+  "+n  :" + n+ " m :"+ m);   //i : 3 j :4 n: 4 m :6
        if(s.charAt(i) == t.charAt(j))
        { 
            i++; j++;
        }
        else if(t.charAt(i-1)==t.charAt(j)){

         j++; 
        }
        else{
            return false;
         }


    }
    System.out.println("i : "+i + " j :"+j);
    
   
     
    while(j < m){
            if(s.charAt(i-1) == t.charAt(j))
            { j++;}
            else{
                return false;
            }
        }

     
     if(i < n){
        return false;
     }


    return true;
}
}
