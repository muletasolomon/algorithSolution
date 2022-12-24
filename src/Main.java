public class Main {

    public static void main(String[] args) {

        System.out.println("algorithm review !");
//        System.out.println("1. is all even \t "+isAllEvens(1224));
        int n [] = {2, 6, 3,4};
//        System.out.println("2. is is Magic Array \t "+isMagiArray(n));
        System.out.println("3. is is is Complete \t "+isComplete(n));
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
            if(n%i==0){
                primeCount = primeCount+1;
            }
        }
        if(primeCount>2){
            return 0;
        }else return 1;
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
}
