public class pal {
    public static void main(String[] args) {
        String l="ogokuluogo";
        String l1="";
        for (int i = l.length()-1; i>=0; --i) {
            l1+=l.charAt(i);

            
        }
        System.out.println(l.equals(l1)? "palindrom":"not palindrome");
    }
}
