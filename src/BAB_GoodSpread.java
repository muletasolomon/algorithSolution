public class BAB_GoodSpread {
    /*
    Write a function called goodSpread that returns 1 if no value in its array argument occurs more
    than 3 times in the array.For example, goodSpread(new int[] {2, 1, 2, 5, 2, 1, 5, 9} returns 1 because no value occurs more
    than three times. But goodSpread(new int[ ] {3, 1, 3 ,1, 3, 5, 5, 3} ) returns 0 because the value 3 occurs four times.
     */

    public static void main(String args[]){
        int[] n = {3, 1, 3 ,1, 3, 5, 5, 3};
        System.out.println(goodSpread(n));
    }

    public static int goodSpread(int [] input){

        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = 0; j < input.length; j++) {
                if(input[i]==input[j]){
                    count++;
                }
            }
            if(count>3){
                return 0;
            }
        }
        return 1;
    }

}


