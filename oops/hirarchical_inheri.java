public class hirarchical_inheri {
    public static void main(String[] args) {
         son obj1=new son();
         obj1.hobby1();
         obj1.hobby3();
         
         daughter obj2=new daughter();
         obj2.hobby1();
         obj2.hobby2();
    }
}
class parent{
    String parent_name="govindhan";
    void hobby1(){
        System.out.println("showting");

    }
}
class daughter extends parent{
    String daughter_name="kayalvizhi";
    void hobby2(){
        System.out.println("song");

    }
}
class son extends parent{
    String son_name="kadhiravan";
    void hobby3(){
        System.out.println("speaking ...");

    }
}