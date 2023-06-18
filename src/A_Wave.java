public class A_Wave {
        /*
//        A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
//        example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
//        Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
//        primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
//        other than 1 and itself.
         */

    public static void main(String args[]){

        int [] n = {7, 2, 9, 10, 5};
        System.out.println("is wave array ?"+isWaveArray(n));

    }

//    public static int isMagic(int[] n){
//
//        int sum =0;
//        int firstElement = n[0];
//        if(firstElement<0){
//            return 0;
//        }
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]> 0 &&)A_Wave
//        }
//    }

    public static int isWaveArray(int[] a) {
        int start = 0;
        int n = a.length-1;
        for (int i = start; i < a.length; i++) {
            if(a[i]%2==0&&a[n]%2!=0){
                return 0;
            }
            if(a[i]%2!=0&&a[n]%2==0){
                return 0;
            }
            n--;
        }
    return 1;
    }
}