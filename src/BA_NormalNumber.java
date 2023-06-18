public class BA_NormalNumber {
//    A_Evens normal number is defined to be one that has no odd factors, except for 1 and possibly itself.
//    Write a method named isNormal that returns 1 if its integer argument is normal, otherwise it returns 0. The
//    function signature is
//    int isNormal(int n)
//    Examples: 1, 2, 3, 4, 5, 7, 8 are normal numbers. 6 and 9 are not normal numbers since 3 is an odd factor. 10 is
//    not a normal number since 5 is an odd factor.
    public static void main(String[] args) {

        int n = 4;
        System.out.println(isNormal(n));
//        System.out.println((int) Math.pow(2,4));
    }

    public static int isNormal(int a) {
        for (int i = 0; i < a; i++) {
            if(a%i!=0){
                if(i%2!=0){
                    return 0;
                }
            }
        }
        return 1;
    }
}
