public class problem1 {
    public static void main(String[] args) {
        int a=99800;
        int count=0;
        int b=0;

        while(a>0){
            b=a%10;
            a=a/10;
            count++; 


        }
        System.out.println(count);
        System.out.println(231%10);
        System.out.println(231/10);
    }
}
