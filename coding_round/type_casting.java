public class type_casting {
    public static void main(String[] args) {
       

        // Implicit casting: int -> double
        int a = 10;
        double b = a;

        System.out.println("Implicit Casting:");
        System.out.println("int value = " + a);
        System.out.println("double value = " + b);

        // Explicit casting: double -> int
        double x = 25.75;
        int y = (int) x;

        System.out.println("\nExplicit Casting:");
        System.out.println("double value = " + x);
        System.out.println("int value = " + y);

        // char -> int (implicit)
        char ch = 'A';
        int num = ch;

        System.out.println("\nchar to int:");
        System.out.println("char value = " + ch);
        System.out.println("int value = " + num);

        // int -> char (explicit)
        int n = 66;
        char letter = (char) n;

        System.out.println("\nint to char:");
        System.out.println("int value = " + n);
        System.out.println("char value = " + letter);
    }
}
    