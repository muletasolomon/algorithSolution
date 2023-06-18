public class AB_Balance {

    public static void main(String [] args){
            int [] vls  = {2,3,2,3,3,4};
        System.out.println(isBalanced(vls));
    }


    public static int isBalanced(int [] values) {
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0 && values[i] % 2 != 0) {
                return 0;
            }
            if (i % 2 != 0 && i % 2 == 0) {
                return 0;
            }

        }
    return 1;}
}

