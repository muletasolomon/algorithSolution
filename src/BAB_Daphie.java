public class BAB_Daphie {
//    A Daphne array is defined to be an array that contains at least one odd number and begins and
//    ends with the same number of even numbers.
//    So {4, 8, 6, 3, 2, 9, 8,11, 8, 13, 12, 12, 6} is a Daphne array because it begins with three even
//    numbers and ends with three even numbers and it contains at least one odd number
//    The array {2, 4, 6, 8, 6} is not a Daphne array because it does not contain an odd number.
//    The array {2, 8, 7, 10, -4, 6} is not a Daphne array because it begins with two even numbers but ends
//    with three even numbers.

    public static void main(String args[]){
        int [] val = {2, 4, 6, 8, 6};
        System.out.println(Daphie(val));
    }

    public static int Daphie(int[] a) {
        //1. check if there is odd number.
        //2. find index at which even is changed to odd.
        // iterate with the lenght of the index if the first and last element are identical.
        boolean noOdd = true;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0){
                noOdd = false;
                break;
            }
        }
        if(noOdd){
            return 0;
        }

        int index = 0;
        for (int i = 0; i < a.length ; i++) {
            if(a[i]%2==0&&a[i+1]%2!=0){
                if(a[a.length-1-i]%2==0&&a[a.length-1-(i+1)]%2!=0){
                index = i;
                break;
                }else return 0;
            }
        }
        int n = a.length;
        while (index>=0){

            if(a[index]%2==0&&a[n-1]%2!=0){
                return 0;
            }
            if(a[index]%2!=0&&a[n-1]%2==0){
                return 0;
            }

            n= n-1;
            index = index-1;
        }
        return 1;
    }

}


