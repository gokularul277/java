public class reversenum {
    public static void main(String[] args) {
        int a=4587786;
        int rev=0;

        while(a!=0){
            int b=a%10;
            rev=(rev*10)+b;
            a/=10;
        }
        System.out.println(rev);
    }
}
