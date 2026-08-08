public class multilevel_inheritance {
    public static void main(String[] args) {
        son obj1=new son();
        System.out.println(obj1.grand_dad_name);
        System.out.println(obj1.dad_name);
        System.out.println(obj1.son_name);

        obj1.hobby1();
        obj1.hobby2();
        obj1.hobby3();
    }
}
class grand_dad{
    String grand_dad_name="hiiiiiiiiiii";
    void hobby1(){
        System.out.println("showting");

    }
}
class dad extends grand_dad{
    String dad_name="arul";
    void hobby2(){
        System.out.println("song");

    }
}
class son extends dad{
    String son_name="gokul";
    void hobby3(){
        System.out.println("speaking ...");

    }
}


