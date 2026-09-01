public class sumofdigit {
    public static void main(String[] args) {
        int n=391;
        int rev=0;
        int v=n;


        while (true) { 
            if(n<=0){
                break;
            }
            int a=n%10;
            rev=(a)+rev;
            n=n/10;

            
        }
        System.out.println(rev);

    }
}




