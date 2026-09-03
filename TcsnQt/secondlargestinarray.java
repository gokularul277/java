public class secondlargestinarray {
    public static void main(String[] args) {
        int []a={90,76,98,543,8999,6};
        //int max=a[0];
        a[sl(a)]=Integer.MIN_VALUE;
        System.out.println(a[sl(a)]);
        
    }
    static int sl(int []a){
        int max=a[0];
        int m=0;
        for (int i = 0; i <a.length; i++) {
            if(max<a[i]){
                max=a[i];
                m=i;
            }

            
        }
        return m;


    }
}
