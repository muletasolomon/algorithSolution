public class AB_Complete {


    public static void main(String args[]){
       int[] arrs= {2, 3, 2, 4, 11, 6, 10, 9, 8};
        System.out.println(complete(arrs));
    }
    static int complete(int[] a) {
        int max=0;
        for(int i=0; i<a.length; i++){
            if(a[i]<=0)
                return 0;
            if(a[i]%2==0){
                if(max<a[i])
                    max=a[i];
            }
        }


        int count=0, maximum=max;
        while(max>=2){
            for(int i=0; i<a.length; i++){
                if(max==a[i]){
                    count++;
                    break;
                }}
            max=max-2;}
        if(count== maximum/2)
            return 1;
        return 0;
    }
}
