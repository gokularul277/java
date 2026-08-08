public class mulin{
    public static void main(String[] args) {
        son2 obj2=new son2();
        System.out.println(obj2.fname);
        System.out.println(obj2.mname);
        System.out.println(obj2.sname);
        obj2.print1();
    }
}

class mom1{
    String mname ="jothi";
    void print1(){
        System.out.println("house management");
    }
}

class father1 extends mom1{
    String fname="arul";
    void print1(){
        System.out.println("source of income");
    }
}
class son2 extends father1{
    String sname="Gokul";
    void print1(){
        System.out.println("study");
    }

}
