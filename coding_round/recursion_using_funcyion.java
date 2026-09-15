public class recursion_using_funcyion {
    public static void main(String[] args) {
        recursion_using_funcyion s=new recursion_using_funcyion();
        System.out.println(s.fact(5));
        
    }


    int fact(int n){
        if(n>0 && n<2){
            return 1;
        }
        else{
            return  n*fact(n-1);
        }
    }
}
