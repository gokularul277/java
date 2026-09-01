public class lcmoftwonumber {
    public static void main(String[] args) {
        int a=98;
        int b=68;
        int gcd=0;

        for (int i = 1; i <=98; i++) {
            if(a%i==0 && b%i==0){
                gcd=i;
            }
            
        }
        System.out.println(a*b/gcd);
    }
}


