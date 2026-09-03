public class sumofprime {
    public static void main(String[] args) {
        int n=10;
        int c=0;
        int j=2;
        int sum=0;
        while(c<10){
            if(prime(j)){
                System.out.println(j);
                c++;
                sum=sum+j;
                
            }
            j++;

        }
        System.out.println(sum);
        
    }
    static boolean prime(int a){
        if(a==2){
            return true;
        }
        for (int i = 2; i <a; i++) {
            if(a%i==0){
                return false;
            }
            
        }
        return true;
    }
}
