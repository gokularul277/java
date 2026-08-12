public class tryangle {
    public static void main(String[] args) {
        int a=45;
        int b=45;
        int c=94;

        if(a>0 && a==b && a==c && a+b+c==180){
            System.out.println("equal");
        }
        else if (a>0 && (a==b || a==c) && a+b+c==180){
            System.out.println("2 side equal");

        }
        else if(a>0 && (a!=b && a!=c) && a+b+c==180){
            System.out.println(" 3 various change");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
