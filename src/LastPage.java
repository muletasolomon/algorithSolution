public class LastPage {
    public static void main(String[] args) {

        System.out.println("algorithm review 2!");
        int n [] = {2, 1, 3,4};;
        System.out.println(isSymetric(n));

    }

    // an array is said to be sub array, if the sum of all elements are less than that the number after that.
    static int subArray(int [] a){
        /*solution
            a{13,6,3,4}
            two approches
            first, try to check from right to left.
                i. find the sum for each iteration.then compare it with the successor.
            second, try to check from left to right.
                i.find the preceding element then.
         */
//        i. from right to left
//        return rightLeftApproach(a);
        return leftRightApproach(a);

    }

    private static int rightLeftApproach(int[] a) {
        int sum = 0;
        for (int i = a.length-1; i >= 0; i--) {
            if(i!=a.length-1){
                //**note,to find the previous index we need to add one
                sum = sum + a[i+1];
                if(sum>a[i]){
                    return 0;
                }
            }
        }
        return 1;
    }
    private static int leftRightApproach(int[] a) {

        for (int i = 0;i<a.length; i++) {
            int sum = 0;
            for (int j = i+1; j < a.length; j++) {
                sum = sum+a[j];
            }
            if(sum>a[i]){
                return 0;
            }
        }
        return 1;
    }

    // symmetric array {if odd or even elements are symetric with their corresponding elements}
    private static int isSymetric(int[] a){
        //create two pointers to check from left right = > i and right left = > n
        int n = a.length-1;
        for (int i = 0; i < a.length; i++) {

           if(a[i]%2!=0 && a[n]%2==0){
               return 0;
           }
            if(a[i]%2==0 && a[n]%2!=0){
                return 0;
            }
            n--;
        }    return 1;

}}











