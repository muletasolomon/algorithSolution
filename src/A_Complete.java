public class A_Complete {
        /*
        An Evens number is an integer whose digits are all even. For example 2426 is an Evens number
            but 3224 is not.
            Write a function named isEvens that returns 1 if its integer argument is an Evens number otherwise it
            returns 0.
         */

    public static void main(String args[]){
        int [] n = {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7};
      int count = 0;
        for (int i = 1; i < 5; i++) {
            count ++;
//            System.out.print(" "+i);
//            System.out.println(" "+co);
        }
//        System.out.println(count);
        System.out.println(isComplete(n));
    }

//    public static int isMagic(int[] n){
//
//        int sum =0;
//        int firstElement = n[0];
//        if(firstElement<0){
//            return 0;
//        }
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]> 0 &&)
//        }
//    }

    public static int isComplete(int a[]){
        //a. let be the first even number is the min and max.
        //b. find min and max even number.
        //c. check difference between max and min.
        //d. find numbers between min and max in the array.
        //e. check if count is simlar to numbers between max and min => (max-min)+1;

        //a

        int max = 0,min= 0,count =0,y = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){min=max=a[i];}
        }
        //b
        for (int i = 0; i < a.length; i++) {
            if((a[i]%2==0)&&(a[i]>max)){
                max = a[i];
            }
            if((a[i]%2==0)&&(a[i]<min)){
                min = a[i];
            }
        }

        //c
        if(max-min==0){return 0;}

        //d
        for (int i = min; i < max; i++) {
            boolean isfound = false;

            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                    isfound =true;
                }
            }
            if(isfound==false){
                return 0;
            }
        }
        return 1;
    }

}