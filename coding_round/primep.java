public class primep {
    static int count=0;
    public static void main(String[] args) {
        int n = 7;
        
        int i=0;

        while(count<n){
            i++;
            if(gi(i)){
                System.out.print(i+" ");
            }
            
            
        }
    }

    static boolean gi(int i) {

        if (i < 2) {
            return false;
        }

        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        count++;
        return true;
    }
}
