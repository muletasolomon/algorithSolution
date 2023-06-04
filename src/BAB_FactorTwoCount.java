public class BAB_FactorTwoCount {
//    1. Write a function named factorTwoCount that returns the number of times that 2 divides the
//    argument.
    /*
        For example, factorTwoCount(48) returns 4 because
        48/2 = 24
        24/2 = 12
        12/2 = 6
        6/2 = 3
        2 does not divide 3 evenly.
     */

    public static void main(String args[]){
        System.out.println(factorTwoCount2(48));
    }

    public static int factorTwoCount(int number){
        int count = 0;
        while(number>0){
            int val = number/2;//24
            if((number/2)%2==0){
                count++;
            }

            number = val;
        }
        return count;
    }

    //option 2

    public  static int factorTwoCount2(int val){
        if(val==0||val%2!=0){
            return 0;
        }

        int count = 0;
        while (val%2==0){
            val = val/2;
            count++;
        }
        return count;
    }
}


