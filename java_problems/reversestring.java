public class reversestring {
    public static void main(String[] args) {
        float fo=78.09f;

        String s=String.valueOf(fo);
        int l=s.length();
        for (int i = l-1; i >=0; i--) {
            System.out.print(s.charAt(i));
            
        }
    }
}
