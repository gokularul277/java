public class array_left_rotation {
    public static void main(String[] args) {
        int a[]={89,56,78,5,4};


        int first=a[0];
        
        for (int i = 0; i <a.length-1; i++) {
            a[i]=a[i+1];
            
        }
        a[a.length-1]=first;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }

    }
}
