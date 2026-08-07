public class swapping {
    public static void main(String[] args) {
        int a=20;
        int b=10;
        //operation
       /* int t=a;
        a=b;
        b=t;
        System.out.println(a);
        System.out.println(b);*/ 

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);

    }
    
}
