public class amstrongno {
    public static void main(String[] args) {
        int a=371;
        int b=a;
        int s=0;
        while(b>0){
            int f=b%10;
            s=s+(f*f*f);
            b=b/10;
        }
        if(s==a)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");

        
    }}