public class missing {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,9};
        int n=a.length+1;
        int d=n*(n+1)/2;
        int f=0;
       
            

            
        
        for (int i = 0; i < a.length; i++) {
            f+=a[i];
            
        }
        System.out.println(d-f);
    }
    
}
