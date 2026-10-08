
import java.util.*;
public class twopointer {
    public static void main(String[] args) {
        int a[]={1,3,1,4,3,6,2};
        Arrays.sort(a);
        int k=0;
        for (int i =1; i <a.length; i++) {
            try{
            if(a[k]!=a[i+k]){
                k++;
                a[k]=a[i];

            }}
            catch(Exception e){
                k--;
            }
            
        }
        System.out.println(k+1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }

    }
}
