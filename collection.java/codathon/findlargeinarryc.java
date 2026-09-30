public class findlargeinarryc {
    public static void main(String[] args) {
        int a[]={1256,987,7676,87,22};

        a[sec(a)]=Integer.MIN_VALUE;
        int second=a[sec(a)];
        System.out.println(second);

    }
    static int sec(int []a){
        int l=a[0];
        int m=0;
        for(int i=0;i<a.length;i++){
            if(l<a[i]){
                l=a[i];
                m=i;
            }
        }
        return m;
        


    }
}
