import javax.swing.plaf.basic.BasicBorders.MarginBorder;

public class Leet34 {
    public static void main(String[] args) {
        int n[] = {5,7,7,8,8,10};
        int t=6;
        int left=0;
        int lidx=-1;
        int ridx=-1;
        int right=n.length-1;
        while(left < right){
            int mid=  left+ (right-left)/2;

            if(n[mid] < t){
                left=mid+1;
                //lidx=mid;
            }else{
                right=mid;
            }
        }
        if(n[left] == t){
            lidx=left;
        }
        left=0;
        right=n.length-1;
        while(left < right){
            //1,2,3,4,4,4,6
            int mid=  left+ (right-left)/2;
            System.out.println("Left : "+left + "Right :"+right+ "Mid :"+mid);
            if(n[mid] < t){
                left=mid+1;
               
            }else if(n[mid] > t){
                right=mid-1;
                //ridx=mid;
            }else{
                left=mid+1;
                ridx=right;
            }
        }
        if(n[right] == t){
            ridx=right;
        }
//2756
        System.out.println("Left :"+lidx+ "Right :"+ridx);

    }
    
}
