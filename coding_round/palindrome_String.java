import java.util.Arrays;

public class palindrome_String {
    public static void main(String[] args) {
        String h="g0g";
        int len=h.length();
        char a[]=h.toCharArray();
        char b[]=new char[len];
        for (int i =len-1 , j=0; i >=0; i--,j++) {
            b[j]=a[i];
            
        }
         System.out.println(Arrays.equals(a, b));
    }
   
}
