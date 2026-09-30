public class reversewordinastringc {
    public static void main(String[] args) {
        String a="java is my favorigth language";
        String[]a1=a.split(" ");
        for(int i = 0; i < a1.length; i++) {
            System.out.print(hello(a1[i])+"");

            
        }
    }

    static String hello(String a){
        String b=" ";
        for (int i = a.length()-1; i >=0; i--) {
            b=b+a.charAt(i);
            
        }
        return b;

    }
}
