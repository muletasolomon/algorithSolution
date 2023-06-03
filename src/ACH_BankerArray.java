public class ACH_BankerArray {
    public static void main(String[] args) {
//        A Bunker array is defined to be an array in which at least one odd number is immediately followed by a
//        prime number. So {4, 9, 6, 7, 3} is a Bunker array because the odd number 7 is immediately followed by the
//        prime number 3. But {4, 9, 6, 15, 21} is not a Bunker array because none of the odd numbers are immediately
//        followed by a prime number.
        int [] n ={4, 9, 6, 7, 3};
        System.out.println(bankerArray(n));
    }

    public static int bankerArray(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            if(input[i]%2!=0&&isPrime(input[i+1])==1){
                return 1;
            }
        }
        return 0;
    }

    public static int isPrime(int n){
        if(n<=1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        for (int i = 2; i < n/2; i++) {
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }

}
