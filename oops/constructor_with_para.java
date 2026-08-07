public class constructor_with_para {
    public static void main(String[] args) {
        dcons o1=new dcons("balamurugan",false);
        System.out.println(o1.name);
        System.out.println(o1.attendance);
    }
    }

    class dcons{
        String name;
        boolean attendance;
        dcons(String nam,boolean att){
            name=nam;
            attendance=att;
        }
    }
