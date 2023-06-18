public class AB_Nice {
//        1, --------0
//        1,----------1
//        3*1 +2*1 = 5------------2
//        3*5 +2*1 = 17------------3
//        3*17 + 2*5 = 61----------4
    //    3*61 + 2*17 = 217---------5
    //    3*217 + 2 * 61 = 556--------------6 3*val(i-1)+2*val(i-2)

 public static void main(String args[]){
     System.out.println("++++"+isNiceArray(20));
 }

    public static  int isNiceArray(int num) {
        int val_0 = 1;
        int val_1 = 1;
        int result = 0;
        for (int i = 1; i < num; i++) {
            result = 3 * val_1 + 2 * val_0;
            if (result == num) {
                return 1;
            } else {
                val_0 = val_1;
                val_1 = result;
            }
        }
        return 0;
    }

}
