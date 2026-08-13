public class b_w_prime_number {
    public static void main(String[] args) {
        for (int k =3; k <=90; k++){
            System.out.println(k+" "+primee(k));
        }
    }
    
    static String primee(int t){
        for (int i = 2; i<t; i++) {
                if(t%i==0)
                    return "composite";
                
            }
        return "prime";
            

    }
}


    



