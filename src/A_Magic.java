public class A_Magic {
        /*
               An array is defined to be a Magic array if the sum of the primes in the array is equal to the first
        element of the array. If there are no primes in the array, the first element must be 0. So {21, 3, 7, 9,
        11 4, 6} is a Magic array because 3, 7, 11 are the primes in the array and they sum to 21 which is the
        first element of the array. {13, 4, 4, 4, 4} is also a Magic array because the sum of the primes is 13
        which is also the first element. Other Magic arrays are {10, 5, 5}, {0, 6, 8, 20} and {3}. {0} is not a
        Magic array because the sum of the primes is 5+5+3 = 13. Note that -5 is not a prime because prime
        numbers are positive.
         */

    public static void main(String args[]){
        System.out.println(isPrimeFromBard(2));
    }

    public static int isMagic(int[] n){

        int sum =0;
        int firstElement = n[0];
        if(firstElement<0){
            return 0;
        }
        for (int i = 0; i < n.length; i++) {
            if(n[i]> 0 && isPrime(n[i])){
                sum = sum +n[i];
            }
        }
        if(sum==firstElement){
            return 1;
        }
        return 0;
    }

    public static boolean isPrime(int val){
        if(val<1)return false;
        if(val%2==0)return true;
        for (int i = 3; i < val; i++) {
            if(val%i==0){
                return false;
            }
        }
        return true;
    }

    //optimized one
    public static boolean isPrimeFromBard(int val){
        System.out.println(val);
//        val = val+1;
        if(val < 1){return false;}

        //@val 2 i will not check because Math.sqrt(2) < 2, there it will not get into the loop
        for (int i = 2; i < Math.sqrt(val); i++) {
            System.out.println("^^^"+Math.sqrt(val));
            if(val%i==0) {
                return false;
            }
            }
        return true;
    }
}