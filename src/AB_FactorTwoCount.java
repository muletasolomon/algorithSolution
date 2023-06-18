public class AB_FactorTwoCount {


    public static void main(String args[]){
        System.out.println(factorTwoCountn(16));
    }


    public static int factorTwoCountn(int num){
        int count = 0;
        while (num%2==0){
            count++;
            num = num/2;
        }
        return count;
    }


}
