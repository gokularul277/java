
import java.util.Arrays;
public class anagram {
    public static void main(String[] args) {
        String a="gokul";
        String b="logku";
        char[]a1=a.toCharArray();
        char[]b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        for (int i = 0; i < a1.length; i++) {
             System.out.print(a1[i]);
            
        }
        System.out.println();
       for (int i = 0; i < a1.length; i++) {
             System.out.print(b1[i]);
            
        }

    }
}
