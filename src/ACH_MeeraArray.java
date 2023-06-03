public class ACH_MeeraArray {
        /*
        A Meera array is defined to be an array such that for all values n in the array, the value 2*n is not in the
    array. So {3, 5, -2} is a Meera array because 3*2, 5*2 and -2*2 are not in the array. But {8, 3, 4} is not
    a Meera array because for n=4, 2*n=8 is in the array.
    Write a function named isMeera that returns 1 if its array argument is a Meera array. Otherwise it returns 0.
         */

    public static void main(String[] args) {

        int [] n ={3, 5, -2};
        System.out.println(isMeera(n));
//        System.out.println((int) Math.pow(2,4));
    }

    public static int isMeera(int [] input){
        for (int i = 0; i < input.length; i++) {
            boolean status= false;
            for (int j = 0; j < input.length; j++) {
                if(input[i]==((int) Math.pow(2,input[j]))){
                    status = true;
                }
            }
            if(status){
                return 0;
            }
        }
        return 1;
    }
}
