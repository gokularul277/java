public class class1 {
    public static void main(String[] args) {
        app o1=new app();
        o1.set("gokul",1131) ;                       //o1.name="gokul";
                                //o1.rollno=9000;
        o1.display();
        
    }
}
class app{
    String name;
    int rollno;
    void set(String a,int b){
        name=a;
        rollno=b;

    }
    void display(){
        System.out.println(name);
        System.out.println(rollno);
    }
}
