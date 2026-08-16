public class reverse_string {
    public static void main(String[] args) {
        String g="Jooook";
        int l=g.length();
        for (int i = l-1; i >=0; i--) {
            System.out.println(g.charAt(i));
        }
    }
}
