public class recursion {
    public static void main(String[] args) {
        recur(100);
    }
    public static void recur(int a){
        if (a==1){
            System.out.println(1);
            
        }
        else{
        System.out.println(a);
        recur(a-1);}
    }    
}
