public class Leet1154 {
    public static void main(String[] args) {
        
        /*
         * Given a string date
         *  representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.
         * 
         * Input: date = "2019-01-09"
           Output: 9
          Explanation: Given date is the 9th day of the year in 2019.
         */
        String s  = "2019-07-09";
        String[] out = s.split("-",3);
        

        int year= Integer.parseInt(out[0]);
        boolean y = checkYear(year);


        int day=Integer.parseInt(out[2]);
        int month = Integer.parseInt(out[1]);
        int sum=0;
        System.out.println(checkYear(year));
        for(int i=1;i<month;i++){

            if(i==2 && checkYear(year)){
                sum=sum+29;
                break;

            }else if(i%2 == 0 && i !=8){
                sum=sum+30;

            }else{
                sum=sum+31;
            }
        }
        System.out.println(sum+day);

    }
    public static boolean checkYear(int year){
        if(year %4 == 0){
            if(year %100 ==0){
                if(year %400 ==0){
                    return true;

                }else{
                    return false;
                }

            }else{
                return true;
            }

        }else{
            return false;
        }
    }
}
