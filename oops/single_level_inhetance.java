public class single_level_inhetance {
    public static void main(String[] args) {
        son obj1=new son();
        System.out.println(obj1.son_name);
        System.out.println(obj1.dad_name);
        obj1.hobby1();
        obj1.hobby2();
    }
}
class dad{
    String dad_name="arul";
    void hobby1(){
        System.out.println("song");

    }
}
class son extends dad{
    String son_name="gokul";
    void hobby2(){
        System.out.println("speaking ...");

    }
}


