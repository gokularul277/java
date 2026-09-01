public class prime {
    public static void main(String[] args) {
        if(pr(4)){
            System.out.println("consonant");
        }
        else{
             System.out.println("prime");

        }
       
        
    }
    static boolean pr(int a){
        for (int i =2; i < a; i++) {
            if(a%i==0){
            return true;
            
            }
            
        }
        return false;

    }
}
