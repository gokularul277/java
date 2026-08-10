
import java.util.Arrays;

public class packages_string {
    public static void main(String[] args) {
        String s="gokul";
        String g="sug-umar";
        String f2="gokgulg";
        String f3="GOKUL";
        String f4="                         fi gokul koooo                     ";
        System.out.println(s.length());//yo find length
        System.out.println(s.substring(1, 4));
        System.out.println(s.substring(0));
        System.out.println(s.equals(f2));
        System.out.println(s.equalsIgnoreCase(f3));
        System.out.println(s.compareTo(g));
        System.out.println("gokul".toUpperCase());
        System.out.println("GOKUL".toLowerCase());
        System.out.println(f4.trim());

        // wrapper class
        System.out.println(f4.replace('o', 'k'));
        System.out.println(f2.contains("g"));
        System.out.println(f2.indexOf("g"));
        System.out.println(f2.lastIndexOf("g"));
        String []tt=g.split("-");

        System.out.println(Arrays.toString(tt));

        
    }
}
