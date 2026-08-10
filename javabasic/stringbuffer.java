public class stringbuffer {
    public static void main(String[] args) {
        String k="d sugumar";
        k=k+"yuuu";
        System.out.println(k);

        StringBuilder p=new StringBuilder("juuuli");
        System.out.println(p);
        p.append("looyu");
        System.out.println(p);
        p.insert(4,"j");
        System.out.println(p);
        p.replace(0, 2, "kk");
        System.out.println(p);
        p.delete(1, 6);
        System.out.println(p);
        p.deleteCharAt(0);
        System.out.println(p);
        System.out.println(p.reverse());

    }
}
