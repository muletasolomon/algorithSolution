//public class OneToTwentiyTwo {
//
//    public static void main(String[] args) {
//
//        System.out.println("algorithm review !");
////        System.out.println("1. is all even \t "+isAllEvens(1224));
//        int n [] = {4, 7, 16};;
////        System.out.println("2. is is Magic Array \t "+isMagiArray(n));
////        System.out.println("3. is is is Complete \t "+isComplete(n));
////        System.out.println("4. is primeProduct \t "+isPrimeProduct(22));
////        System.out.println("5. is balanced \t "+isBalanced(n));
////        System.out.println("6. is Centered \t"+isCentered(n));
////        System.out.println("7. has K SmallFactors "+hasKSmallFactors(6,30));
////        System.out.println("8. fill \t"+fill(n,2,10));
////        System.out.println("9. hallow arrary \t"+isHallow(n));
////        System.out.println("10. minDistance(int n)"+minDistance(8));
////        System.out.println("11. is wave array "+iswaveArray(n));
//        System.out.println("12. is BeanArray "+isBeanArray(n));
//    }
//
//
//    //1. is allEven
//    public static int isAllEvens(int n){
//        while (n!=0) {
//            if((n / 10) % 2 == 0){
//                n= n/10;
//            }else return 0;
//
//        }
//        return 1;
//        }
//
//        //2. Magic array.
//    public static int isMagiArray(int[] a){
//        int primeSum = 0;
//        if(a.length>1){
//            if(a[0]==0){
//                return 1;
//            }
//        }
//        for (int i = 0; i < a.length; i++) {
//            if(isPrime(a[i])==1){
//                primeSum= primeSum+a[i];
//            }
//        }
//        if(a[0]==primeSum){
//            return 1;
//        }else return 0;
//    }
//
//    // is prime
//    public static int isPrime(int n){
//        int primeCount = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                primeCount = primeCount + 1;
//            }
//        }
//        if (primeCount > 2) {
//            return 0;
//        } else return 1;
//    }
//    // 3. complete
////(condition) ? (what happens if true) : (what happens if false);
//    public static int isComplete(int[] a){
//        //The array contains even numbers
//        //All numbers between min and max are in the array
//        //Min does not equal max
//        int evenCount =0 ;
//        int min = 0;
//        int max = 0;
//        for (int i = 0; i < a.length; i++) {
//            if(a[i]%2==0){
//                min=max=a[i];
//            }
//        }
//
//        for (int i = 0; i < a.length ; i++) {
//            if(a[i]%2==0){{
//                max=(a[i]>max)?a[i]:max;
//                min=(a[i]<min)?a[i]:min;
//                 evenCount++;
//                }
//
//            }
//        }
//        if(evenCount==0&&(max-min)==0){
//            return 0;
//        }
//
//        for (int i = min; i <= max ; i++) {
//           boolean isFound = false;
//            for (int j = 0; j < a.length; j++) {
//                if(i==a[j]){
//                    isFound=true;
//                    continue;
//                }
//            }
//            if(!isFound){
//                return 0;
//            }
//
//        }
//
//        return 1;
//
//    }
//
//
//    // 4. prime product
//    //A primeproduct is a positive
//    // integer that is the product of exactly two primes greater than 1
//
//    // sol, find factors of the input number and filter prime numbers
//
//    public static int isPrimeProduct(int inputnum) {
//
////        int a[] = new int[inputnum];
////
////        for (int i = 1; i < inputnum; i++) {
////
////            if (inputnum % i == 0) {
////                if (isPrime(i) == 1) {
////                    for (int j = 0; j < inputnum; j++) {
////                        if (isPrime(j) == 1) {
////                            if ((j * i) == inputnum) {
////                                return 1;
////                            }
////                        }
////                    }
////                }
////            }
////
////        }
////        return 0;
////            /*
//        int n = inputnum;
//        for (int i = 2; i < n; i++) {
//            if ((n % i == 0) && isPrime(i)==1) {
//                for (int j = i + 1; j < n; j++)
//                    if (n % j == 0 && isPrime(j)==1) {
//                        if (i * j == n)
//                            return 1;
//                    }
//            }
//        }
//        return 0;
//    }
////     */
//
//
//
//    // 5. is balanced
//    public  static  int isBalanced(int[] a){
////        An array is called balanced if its even numbered elements (a[0], a[2], etc.) are even and its odd
////        numbered elements (a[1], a[3], etc.) are odd.
//        for (int i = 0; i < a.length; i++) {
//            if((i%2==0) && (!(a[i]%2==0))){
//               return 0;
//            }
//            if((i%2!=0) && ((a[i]%2==0))){
//                return 0;
//            }
//        }
//
//    return 1;
//    }
//
//    // 6 . is centered
//    public static int isCentered(int[] input){
//        if((input.length)%2==0){
//            return 0;
//        }
//        if(input.length==1&&input[0]==1){
//            return 1;
//        }
//        int centerValue;
//        int centerIndex = input.length/2;
//        centerValue=input[centerIndex];
//        for (int i = 0; i < centerIndex; i++) {
//            if(input[i]<centerValue){
//                return 0;
//            }
//        }
//        for (int i = centerIndex; i < input.length; i++) {
//            if(input[i]<centerValue){
//                return 0;
//            }
//        }
//        return 1;
//    }
//
//    // 7. is  hasKSmallFactors(int k, int n)
//    /*
//                Given a positive integer k, another positive integer n is said to have k-small factors if n can be
//            written as a product u*v where u and v are both less than k. For instance, 20 has 10-small factors
//            since both 4 and 5 are less than 10 and 4*5 = 20. (For the same reason, it is also true to say that 20
//            has 6-small factors, 7-small factors, 8-small factors, etc). However, 22 does not have 10-small
//            factors since the only way to factor 22 is as 22 = 2 * 11, and 11 is not less than 10.
//     */
//    public static boolean hasKSmallFactors(int k, int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j  < n; j++) {
//                if(i<k&&j<k){
//                    if(i*j==n){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//
//    // 8 . Write a function fill with signature
//        /*
//             fill({1,2,3,5, 9, 12,-2,-1}, 3, 10) returns {1,2,3,1,2,3,1,2,3,1}.
//        fill({4, 2, -3, 12}, 1, 5) returns {4, 4, 4, 4, 4}.
//        fill({2, 6, 9, 0, -3}, 0, 4) returns null.
//         */
//
//    public  static  String fill(int[] a, int k, int n){
//        int newArray[] = new int[k];
//        int finalArray[] = new int[n];
//        for (int i = 0; i < k ; i++) {
//            newArray[i]=a[i];
//        }
//        int j=0;
//        for (int i = 0; i < n; i++) {
//            if(j==newArray.length){
//                j=0;
//            }
//            finalArray[i]=newArray[j];
//            j++;
//        }
//
//        return printArray(finalArray);
//
//    }
//
//
//    public static  String printArray(int[] arrs){
//        String val = "";
//        for (int i = 0; i < arrs.length; i++) {
//          val=val+arrs[i];
//        }
//        return val;
//    }
//
//    /*
//    static int fill(int[] a, int k, int n) {
//        int[] arr2 = new int[n];
//        int t=0;
//        for(int i=0; i<n; i++){
//        if(t<k){
//        arr2[i]=a[t];
//        t++;
//        }
//        else if(t==k){
//        t=0;
//        arr2[i]=a[t];
//        t++;
//        }
//        }
//        return arr2[0]
//        }
//     */
//
//
//
//    //
//    public static int isHallow(int [] arr){
//
//        for (int i = 0; i < arr.length; i++) {
//            if(i+4<arr.length)
//            if(arr[i]!=0){
//                if(arr[i+1]==0){
//                    if(arr[i+2]==0){
//                        if(arr[i+3]==0){
//                            if(arr[i+4]!=0){
//                                return 1;
//                            }
//                        }
//                    }
//                }
//            }
//
//        }
//     return 0;
//    }
//
//
//    //9. minDistance(int n)
///*
//       Write a function named minDistance that returns the smallest distance between two factors of a
//        number. For example, consider 13013 = 1*7*11*13. Its factors are 1, 7, 11, 13 and 13013.
//        minDistance(13013) would return 2 because the smallest distance between any two factors is 2 (13 -
//        11 = 2).
// */
//
//  public static int minDistance(int n){
//
//      int min = n-1;
//      for (int i = 1; i < n; i++) {
//          for (int j = 1; j < n; j++) {
//             if(n%i==0&&n%j==0){
//                 if(i>j){
//                     if((i-j)<min)
//                         min=i-j;
//                 }
//
//                 if(i<j){
//                     if((j-i)<min)
//                         min=j-i;
//                 }
//             }
//          }
//      }
//      return min;
//  }
//
//
//  /*
//          The function signature is
//                int minDistance(int n)
//                static int minDistance(int n) {
//                int min = n;
//                for(int i=1; i<n; i++){
//                if(n%i==0){
//                for(int j=i+1; j<n; j++)
//                if(n%j==0){
//                if(min>j-i)
//                min = j-i;
//                break;
//                }
//                }
//                }
//                return min;
//                }
//   */
//
//  // 10 . A wave array is defined to an array which does not contain two even numbers or two odd
//    //numbers in adjacent locations. So {7, 2, 9, 10, 5}, {4, 11, 12, 1, 6}, {1, 0, 5} and {2} are all wave
//    //arrays. But {2, 6, 3, 4} is not a wave array because the even numbers 2 and 6 are adjacent to each
//    //other.
//
///*
//        static int iswaveArray(int[] a) {
//        for(int i=0; i<a.length-1; i++){
//        if(a[i]%2==0 && a[i+1]%2==0)
//        return 0;
//        if(a[i]%2!=0 && a[i+1]%2!=0)
//        return 0;
//        }
//        return 1;
//        }
// */
//    public static int iswaveArray(int [] n){
//        if(n.length==1){
//            return 1;
//        }
//        for (int i = 0; i < n.length-1; i++) {
//            if(n[i]%2==0&&n[i+1]%2==0){
//                return 0;
//            }
//            if(n[i]%2!=0&&n[i+1]%2!=0){
//                return 0;
//            }
//        }
//        return 1;
//    }
//
//
//    // 11. Bean array i
//            /*
//            a. If it contains a 9 then it also contains a 13.
//            b. If it contains a 7 then it does not contain a 16.
//            So {1, 2, 3, 9, 6, 13} and {3, 4, 6, 7, 13, 15}, {1, 2, 3, 4, 10, 11, 12} and {3, 6, 9, 5, 7, 13, 6, 17} are
//Bean arrays. The following arrays are not Bean arrays:
//a. { 9, 6, 18} (contains a 9 but no 13)
//b. {4, 7, 16} (contains both a 7 and a 16)
//
///*
//        static int fill(int[] a) {
//        boolean nine = false;
//        boolean thirteen = false;
//        boolean seven = false;
//        boolean sixteen = true;
//        for(int i=0; i<a.length; i++){
//        if(a[i]==9)
//        nine=true;
//        if(a[i]==13)
//        thirteen = true;
//        if(a[i]==7)
//        seven = true;
//        if(a[i]==16)
//        sixteen = false;
//        }
//        If(nine){
//        If(!thirteen)
//        Return 0;
//        If(seven){
//        If(sixteen)
//        Return 0;
//        Return 1;
//        }
// */
////             */
//     public static int isBeanArray(int [] n){
//         Boolean is9 = false;
//
//         Boolean is7 = false;
//         Boolean is16 = false;
//
//        for(int i =0;i<n.length;i++){
//
//            if(n[i]==7){
//                for (int j = 0; j < n.length; j++) {
//                    if(n[j]==16){
//                        return 0;
//                    }
//                }
//            }
//
//            if(n[i]==9){
//                Boolean is13 = false;
//
//                for (int j = 0; j < n.length; j++) {
//                    if(n[i]==9){
//
//                        if(n[j]==13){
//                            is13=true;
//                        }
//                    }
//                }
//                if(!is13){
//                    return 0;
//                }
//            }
//
//        }
//        return 1;
//     }
//}
