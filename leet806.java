public class leet806 {
    public static void main(String[] args) {
        int []w = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int res[] = new int[2];
        res = numberOfLines(w,s);
        System.out.println(res[0] + "  "+res[1]);
    }
    public static int[] numberOfLines(int[] widths, String s1) {
        int[] res = new int[2];
        int s = s1.length();
        int count=0;
        int scount=0;
        int idx=0;
        String sub="";

        
        while(s > 0){
            for(int i=idx;i<s1.length();i++){
               
                if(count <100){     //abcdefghijklmnopqrstuvwxyz
                    sub+=s1.charAt(i);  //sub=accdefghij(9) 
                    count+=widths[i];   //count=10+10+90+10
                    if(count == 100){ 
                        res[0]=count;
                        res[1]=scount;
                        scount++;
                        idx=i+1;  //10
                        count=0;
                        sub="";
                    }
                }else{
                    idx=i;
                    count=0;
                    sub="";
                     if(count == 100){
                        res[0]=count;
                        res[1]=scount;
                        scount++;

                    }
            }


            s--;

        }
        }
        return res;
        
    }
    
}
