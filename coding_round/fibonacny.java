

public class fibonacny {
    public static void main(String[] args) {


        int co=8;
        int a=0;
        int b=1;
        //System.out.print(a);
        //System.out.print(b);
        for (int i = 0;i <=co; i++) {
            System.out.println(fib(i));
            
        }
    }
    static int fib(int b){
        if(b<=1){
            return b;
        }
        else{
            return fib(b-1)+fib(b-2);

        }
            
        
        
        
    }

    
}
