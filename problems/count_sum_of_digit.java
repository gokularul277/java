public class count_sum_of_digit {
    public static void main(String[] args) {
        int a=55555;
        int sum=0;
        while(a!=0){
            int b=a%10;
            sum+=b;
            a=a/10;
        }
        System.out.println(sum);
    }
}
