public class prime_composite {
    public static void main(String[] args) {
        int num=7565656;
        int count=0;
        for (int i = 1; i <=num; i++) {
            if(num%i==0){
                count++;
            }
            
            
        }
        if(count>2){
            System.out.println("composite");
            System.out.println(count);
        }
        else{
        System.out.println("prime");
    System.out.println(count);}
    }
}
