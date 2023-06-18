public class AB_Fibonaci {

    public static void main(String[] args){
        System.out.println("is fanbonacci? "+isFibonacci(4));

    }

    public static int isFibonacci(int n) {
//        1, 1, 2, 3, 5, 8, 13, 21,…
        //check whether the number is fibonacci or not.

        int fab_i = 0;
        int fab_ii = 1;
        int result = fab_i + fab_ii;

        for (int i = 0; i <= n; i++) {
            //note if , condition should come first;
            if (n == result) {
                return 1;
            }
            fab_i = fab_ii;
            fab_ii = result;
            result = fab_i+fab_ii;
        }
        return 0;
//
//        System.out.println("1 "+sum);
//         previos = current;
//         current = sum;
//         sum = previos + current;
//
//        System.out.println("2 "+sum);
//        previos = current;
//        current = sum;
//        sum = previos + current;
//
//        System.out.println("3 "+sum);
//        previos = current;
//        current = sum;
//        sum = previos + current;
//
//        System.out.println("4 "+sum);
//        previos = current;
//        current = sum;
//        sum = previos + current;
//
//        return sum;
//
//    }
    }
}
