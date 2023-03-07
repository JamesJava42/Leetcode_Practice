public class Leetsample {
    public static void main(String[] args) {
        

        int a[]={1,2,3,3,3,4,4,5,6,6,6,6};
        int n=6;
        int left=0;int right=a.length-1;
        int res=0;
        int bres=0;
        for(int i=0;i<a.length;i++){
            if(a[i] == n){
                while( i < a.length){
                    if(a[i] == n){
                        res = i;

                    }
                    i++;
                }
            }

        }
        System.out.println(res);
        
        while(left < right){

            
            int mid= (left+right)/2;
            System.out.println(left+ " --- "+right+ " --- "+mid);

            if(a[mid] <n){
                left=mid+1;

            }
            else if(a[mid] >n){
                 right=mid;
            }else if(a[mid]==n ){
                
                left=right=a.length;
                
                }


            
            else{
               System.out.println("Not Available");
            }

        }
        System.out.println(bres);
    }
}
    

