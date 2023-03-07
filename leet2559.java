public class leet2559 {
    public static void main(String[] args) {

      /* 
       Each query queries[i] = [li, ri] asks us to find the number of strings present in the 
        range li to ri (both inclusive) of words that start and end with a vowel.

       Return an array ans of size queries.length, where ans[i] is the answer to the ith query.

        Note that the vowel letters are 'a', 'e', 'i', 'o', and 'u'.
        */
        
        /*Input: words = ["aba","bcb","ece","aa","e"], 
        queries = [[0,2],[1,4],[1,1]]
        Output: [2,3,0] */

        int[][]a = new int[3][2];
        a[0][0] =0;
        a[0][1]=2;
        a[1][0]=1;
        a[1][1]=4;
        a[2][0]=1;
        a[2][1]=1;
        System.out.println(a.length+" "+ a[0].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++)
            {
            System.out.print("|"+a[i][j]+"|");

        }
        System.out.println();

        /*
         * step1: taken 1 row . hten send row and array to mathed and add to result.
         */

         for(i=0;i<a.length;i++){
            //i=0 ist row 
            
         }
    }
        
    }
}
