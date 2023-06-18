public class A_Evens {
        /*
        An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
            but 3224 is not.
            Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
            returns 0.
         */

    public static void main(String args[]){
        System.out.println(isEvens(4222));
    }

    public static int isEvens(int n){
        while (n>0){
            int r = n%10;
            if((r%2)!=0){
                return 0;
            }
            n=n/10;
        }
        return 1;
    }
}