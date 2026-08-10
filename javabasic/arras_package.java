import java.util.Arrays;

public class arras_package {
    public static void main(String[] args) {
        int a[]={9,0,7};
        int b[]={9,9,9};
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,9);
        System.out.println(Arrays.toString(a)); 
        String v[]={"gokul","arul","goook"};
        System.out.println(Arrays.equals(a,b));
        System.out.println(a==b);
        int y[]=Arrays.copyOf(b,3);
        System.out.println(Arrays.toString(y));
       }
}
