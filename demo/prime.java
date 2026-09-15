public class prime {
    public static void main(String[] args) {
        int a=13;
       
        if (isprime(a)||a<=2) {
            System.out.println("prime");
            
        }
        else{
            System.out.println("consonant");
        }

    }
    static boolean isprime(int a){
        for (int i = 3; i < a; i++) {
            if(a%i==0){
                return false;
            }
            
        }
        return true;

    }
}
