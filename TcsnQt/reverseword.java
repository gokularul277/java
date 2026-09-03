public class reverseword {
    public static void main(String[] args) {
        String l="i love java";
        String o[]=l.split(" ");
        for (int i = o.length-1; i >=0; i--) {
            System.out.println(kl(o[i]));
            
        }

    }
    static String  kl(String a){
        String rev="";
        for (int j = a.length()-1; j >=0; j--) {
            rev=rev+a.charAt(j);

            
        }
        return rev;
    }
}
