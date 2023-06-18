public class A_Fill {
        /*
//      {{4,2,3,1,2,6},2,10}
         */

    public static void main(String args[]){

        int [] n = {7, 2, 9, 10, 5};

        fill(n,2,10);

    }

//    public static int isMagic(int[] n){
//
//        int sum =0;
//        int firstElement = n[0];
//        if(firstElement<0){
//            return 0;
//        }
//        for (int i = 0; i < n.length; i++) {
//            if(n[i]> 0 &&)A_Wave
//        }
//    }

   public static  void fill(int [] a , int k,int n){

        int val[] = new int[n];
        int c = 0;
        for (int i = 0; i < n; i++) {
           if(c<k){
               val[i] = a[c];
               c++;
           }else {
               c =0;
               val[i]=a[c];
               c++;
           }

       }
       for (int i = 0; i < n; i++) {

           System.out.print(' '+val[i]+',');

       }
   }


}