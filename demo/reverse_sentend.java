public class reverse_sentend{
    public static void main(String[] args) {
        String a="i love my skill";
        String []a1=a.split(" ");
        for (int i = 0; i < a1.length; i++) {
            System.out.println(rvinse(a1[i]));

            
        }
    }
    static String rvinse(String a){
        String rev="";
        int len=a.length();
        for (int i = len-1; i >=0; i--) {
            rev+=a.charAt(i);
            
        }
         return rev;

    }
   

}