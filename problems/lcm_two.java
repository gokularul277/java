public class lcm_two {
    public static void main(String[] args) {
        int a=200;
        int b=100;
        int gcd=0;
        int max=a>b ?a:b;
        for (int i = 1; i <=a  ;i++) {
            if(a%i==0 && b%i==0){
                gcd =i;
            }

            
        }
        System.out.println(a*b/gcd);
        System.out.println(gcd);
    }
}
