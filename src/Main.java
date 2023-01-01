public class Main {

    public static void main(String[] args) {

        System.out.println("algorithm review !");
//        System.out.println("1. is all even \t "+isAllEvens(1224));
        int n [] = {2, 3, 1,4,5};
//        System.out.println("2. is is Magic Array \t "+isMagiArray(n));
//        System.out.println("3. is is is Complete \t "+isComplete(n));
//        System.out.println("4. is primeProduct \t "+isPrimeProduct(22));
//        System.out.println("5. is balanced \t "+isBalanced(n));
//        System.out.println("6. is Centered \t"+isCentered(n));
        System.out.println("7. has K SmallFactors "+hasKSmallFactors(6,30));
    }

    //1. is allEven
    public static int isAllEvens(int n){
        while (n!=0) {
            if((n / 10) % 2 == 0){
                n= n/10;
            }else return 0;

        }
        return 1;
        }

        //2. Magic array.
    public static int isMagiArray(int[] a){
        int primeSum = 0;
        if(a.length>1){
            if(a[0]==0){
                return 1;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(isPrime(a[i])==1){
                primeSum= primeSum+a[i];
            }
        }
        if(a[0]==primeSum){
            return 1;
        }else return 0;
    }

    // is prime
    public static int isPrime(int n){
        int primeCount = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                primeCount = primeCount + 1;
            }
        }
        if (primeCount > 2) {
            return 0;
        } else return 1;
    }
    // 3. complete
//(condition) ? (what happens if true) : (what happens if false);
    public static int isComplete(int[] a){
        //The array contains even numbers
        //All numbers between min and max are in the array
        //Min does not equal max
        int evenCount =0 ;
        int min = 0;
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                min=max=a[i];
            }
        }

        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2==0){{
                max=(a[i]>max)?a[i]:max;
                min=(a[i]<min)?a[i]:min;
                 evenCount++;
                }

            }
        }
        if(evenCount==0&&(max-min)==0){
            return 0;
        }

        for (int i = min; i <= max ; i++) {
           boolean isFound = false;
            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                    isFound=true;
                    continue;
                }
            }
            if(!isFound){
                return 0;
            }

        }

        return 1;

    }


    // 4. prime product
    //A primeproduct is a positive
    // integer that is the product of exactly two primes greater than 1

    // sol, find factors of the input number and filter prime numbers

    public static int isPrimeProduct(int inputnum) {

//        int a[] = new int[inputnum];
//
//        for (int i = 1; i < inputnum; i++) {
//
//            if (inputnum % i == 0) {
//                if (isPrime(i) == 1) {
//                    for (int j = 0; j < inputnum; j++) {
//                        if (isPrime(j) == 1) {
//                            if ((j * i) == inputnum) {
//                                return 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//        return 0;
//            /*
        int n = inputnum;
        for (int i = 2; i < n; i++) {
            if ((n % i == 0) && isPrime(i)==1) {
                for (int j = i + 1; j < n; j++)
                    if (n % j == 0 && isPrime(j)==1) {
                        if (i * j == n)
                            return 1;
                    }
            }
        }
        return 0;
    }
//     */



    // 5. is balanced
    public  static  int isBalanced(int[] a){
//        An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even and its odd
//        numbered elements (a[1], a[3], etc.) are odd.
        for (int i = 0; i < a.length; i++) {
            if((i%2==0) && (!(a[i]%2==0))){
               return 0;
            }
            if((i%2!=0) && ((a[i]%2==0))){
                return 0;
            }
        }

    return 1;
    }

    // 6 . is centered
    public static int isCentered(int[] input){
        if((input.length)%2==0){
            return 0;
        }
        if(input.length==1&&input[0]==1){
            return 1;
        }
        int centerValue;
        int centerIndex = input.length/2;
        centerValue=input[centerIndex];
        for (int i = 0; i < centerIndex; i++) {
            if(input[i]<centerValue){
                return 0;
            }
        }
        for (int i = centerIndex; i < input.length; i++) {
            if(input[i]<centerValue){
                return 0;
            }
        }
        return 1;
    }

    // 7. is  hasKSmallFactors(int k, int n)
    /*
                Given a positive integer k, another positive integer n is said to have k-small factors if n can be
            written as a product u*v where u and v are both less than k. For instance, 20 has 10-small factors
            since both 4 and 5 are less than 10 and 4*5 = 20. (For the same reason, it is also true to say that 20
            has 6-small factors, 7-small factors, 8-small factors, etc). However, 22 does not have 10-small
            factors since the only way to factor 22 is as 22 = 2 * 11, and 11 is not less than 10.
     */
    public static boolean hasKSmallFactors(int k, int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j  < n; j++) {
                if(i<k&&j<k){
                    if(i*j==n){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
