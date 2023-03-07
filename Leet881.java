import java.util.Arrays;

public class Leet881 {
    public static void main(String[] args) {
        


        int p[]= {3,2,2,1};
        int le=3;
        int bc=0;

        Arrays.sort(p);
        //{1,2,2,3}

        int left =0;
        int right= p.length -1 ;

        while(left <= right){
            int sum = p[left] + p[right];

            if(sum <= le){
               bc++;
               left++;
               right--;
            }else{
                right--;
                bc++;
            }
        }
        System.out.println(bc);



        
    }
    
}
