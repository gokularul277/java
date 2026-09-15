public interface interface2 {
    public static void main(String[] args) {
        im a=new im();
        a.sappadu();
        a.unavu();
        System.out.println(a.h);
    }
    
}

interface gokul{
    void sappadu();
    int h=90;
    default void unavu(){
        System.out.println("hggffftu");

    }
}
class im implements gokul{
    int h=87;
    

    
    
    public void sappadu(){
        System.out.println("boom");
    }


}
