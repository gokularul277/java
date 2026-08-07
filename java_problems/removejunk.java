public class removejunk {
    public static void main(String[] args) {
        String f="%$$$#&(900gok*ul      a&u&l^";
        f=f.replaceAll("[a ]", "");
        System.out.println(f);
        //^ this is the meaning of except it only replace
    }
}
