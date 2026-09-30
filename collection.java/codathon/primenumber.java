public class primenumber {
    public static void main(String[] args) {
        int n=6;
        int count=0;
        int i=1;
        while(count<6){
            if(prem(i)){
                System.out.print(i+" ");
                count++;

            }
            i++;

            
        }
    }

    static boolean prem(int d){
        if(d<2){
            return false;
        }
        for (int i = 2; i <d; i++) {
            if(d%i==0){
                return false;
            }
            
        }
        return true;

    }
    
}
