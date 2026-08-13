public class prime {
    public static void main(String[] args) {
        int g=71;
        int count =0;
        for (int i =1; i <=78; i++) {
            if(g%i==0){
                count++;
            }
            
        }
        if(count>2){
            System.out.println("consonent");
        }
        else{
            System.out.println("prime");
        }
    }
}
