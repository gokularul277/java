public class reverse {
    public static void main(String[] args) {
        int n=676;
        int rev=0;
        int v=n;


        while (true) { 
            if(n<=0){
                break;
            }
            int a=n%10;
            rev=(rev*10)+a;
            n=n/10;

            
        }
        System.out.println(rev==v ? "palindrome ":"not");

    }
}

