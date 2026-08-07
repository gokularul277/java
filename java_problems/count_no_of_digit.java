public class count_no_of_digit {
    public static void main(String[] args) {
        int a=898444475;
        int count=0;
        int even=0;
        int odd=0;

        while(a!=0){
            int b=a%10;
            if(b%2==0){
                even++;
            }
            else{
                odd++;
            }
            a/=10;
            count++;

        }
        System.out.println(count);
        System.out.println(even);
        System.out.println(odd);
    }
}
