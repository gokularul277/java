public class inserting_element {
    public static void main(String[] args) {
        int [] a=new int [7];
        a[0]=3;
        a[1]=4;
        a[2]=1;
        a[3]=2;
        a[4]=0;
        a[5]=6;
        for (int i = 6; i >0; i--) {
            a[i]=a[i-1];
        }
        a[0]=7999;
        for (int i = 0; i < 7; i++) {
            System.out.println(a[i]);
            
        }
        
        
        }

    
    }

