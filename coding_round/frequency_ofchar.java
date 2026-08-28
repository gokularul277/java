import java.util.LinkedHashSet;
import java.util.Set;

public class frequency_ofchar {
    //static int count=1;
    public static void main(String[] args) {
        String o="gokullambagod";
        char []a=o.toCharArray();
        int poo=0;
        Set<Character> s = new LinkedHashSet<>();

        for (char c : a) {
            s.add(c);
        }
        for ( char j : s) {
            System.out.println(j+"  "+g(a,j));
            poo++;
            
        }
    }





    static int g(char []a,char j){
        int count=0;
        for (int l =0 ; l <a.length; l++) {
            if(j==a[l]){
                count++;

                }
                
            }
            return count;
            
        }
        


    }


