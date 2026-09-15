public class primecontiniues {
    public static void main(String[] args) {
        int count=0;
        int i=1;

        while(count<5){
            if (isprime(i)) {
                System.out.print(i);
                count++;

                
            }
            
            i++;

        }
    }

     static boolean isprime(int a){
        if(a<2){
            return false;
        }
        for (int i = 2; i < a; i++) {
            if(a%i==0){
                return false;
            }
            
        }
        return true;

    }
}
