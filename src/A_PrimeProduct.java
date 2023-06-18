public class A_PrimeProduct {
        /*
//        A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
//        example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
//        Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
//        primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
//        other than 1 and itself.
         */

    public static void main(String args[]){

        System.out.println(isprimeproduct(22));

    }

//    public static int isMagic(int[] n){
//
//        int sum =0;
//        int firstElement = n[0];
//        if(firstElement<0){
//            return 0;
//        }
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]> 0 &&)
//        }
//    }

    public static int isprimeproduct(int a) {
        boolean aisprime = true;
        for (int i = 0; i < a; i++) {
            if(a%i==0&& aisprime){
                for (int j=0 ;j<a; j++) {
                    if(a%j==0&& aisprime){
                        if(i*j==a){
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
}