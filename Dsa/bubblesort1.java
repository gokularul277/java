import java.util.*;
public class bubblesort1 {
    public static void main(String[] args) {
        int a[]={12,38,54,33,9,99};
        int n=a.length;
        int c=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <n-1-i; j++) {
                c++;
                if(a[j]>a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    
                }
                
            }
            
        }
        System.out.println(Arrays.toString(a));
        System.out.println(c);
    }
}
