public class methodOverloading {
    public static void main(String[] args) {
        int a=5;
        int b=10;
        gokul();
        gokul(a);
        gokul(a,b);
        
    }

    static void gokul(){
        System.out.println("gokul1");

    }
    static void gokul(int a){
        System.out.println("gokul"+a);
    }
    static void gokul(int a,int b){
        System.out.println("gokul"+a+b);
    }
}
