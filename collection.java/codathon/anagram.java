
import java.util.*;


public class anagram {
    public static void main(String[] args) {
        String a="gokul";
        String b="loukg";
        char[]a1=a.toCharArray();
        char[]a2=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }


    }
}
