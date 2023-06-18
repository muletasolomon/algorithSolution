public class AB_Sym {
    public static void main(String args[]) {
        int[] input = {2, 7, 9, 10, 11, 5, 9};

        System.out.println(isSym(input));
    }

    public static int isSym(int[] val){

        int val_ = val.length-1;
        for (int i = 0; i < val.length; i++) {
            if(val[i]%2!=0 && val[val_]%2==0){
                return 0;
            }
            if(val[i]%2==0 && val[val_]%2!=0){
                return 0;
            }
            val_--;
        }

        return 1;
    }

}
