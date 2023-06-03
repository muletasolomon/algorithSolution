public class ACH_CountDigit {
    public static void main(String[] args) {
        //countDigit(33331, 3) returns 4
        //countDgit(5444,5) returns 1
        System.out.println("algorithm review 2!");

        System.out.println(countDigit(5444,5));

    }

    public static int countDigit(int n,int input){
        int count = 0;
        int curruntDigit = 0;
        while (n!=0){
            curruntDigit = n%10;
            if(curruntDigit==input){
                count++;
            }
            n = n/10;
        }
        return count;
    }

   }











