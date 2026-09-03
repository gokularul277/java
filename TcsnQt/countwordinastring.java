public class countwordinastring{
    public static void main(String[] args) {
        String s="g o k u l o i s a g o o d b o y";
        char[]p=s.toCharArray();
        for (int i = 0; i <p.length; i+=2) {
            System.out.println(p[i]);
        }
        String []a=s.split(" ");
        //System.out.println(a.length);
    }
}