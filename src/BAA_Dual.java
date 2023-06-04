public class BAA_Dual {

//    An array is said to be dual if it has an even number of elements and each pair of consecutive even and odd elements
//    sum to the same value. Write a function named isDual that accepts an array of integers and returns 1 if the array is dual, otherwise it
//    returns 0. Examples: {1, 2, 3, 0} is a dual array (because 1+2 = 3+0 = 3), {1, 2, 2, 1, 3, 0} is a dual array (because 1+2 = 2+1 = 3+0 = 3),
//    {1, 1, 2, 2}</td> is not a dual array (because 1+1 is not equal to 2+2), {1, 2, 1}</td> <td> is not a dual array (because array does not
//            have an even number of elements), {} is a dual array.

    public static void main(String args[]){
        int [] input = {1, 2, 3, 0};
        System.out.println(isDual(input));
    }

    public static int isDual(int [] a) {
        int sum = a[0]+a[1];
        //NOTE index increments by 2
        for (int i = 0; i < a.length-1; i+=2) {
            if(sum!=(a[i]+a[i+1])){
                return 0;
            }
        }
        return 1;
    }
}
