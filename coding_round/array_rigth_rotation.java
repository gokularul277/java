public class array_rigth_rotation {
    public static void main(String[] args) {
         int a[]={89,56,78,5,4};


        int last=a[a.length-1];
        
        for (int i =a.length-1; i >0; i--) {
            a[i]=a[i-1];
            
        }
        a[0]=last;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }

    }
    }

