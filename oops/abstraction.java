/*public class abstraction {
    public static void main(String[] args) {
        dcons o1=new dcons("balamurugan",false);
        System.out.println(o1.name);
        System.out.println(o1.attendance);
    }
    }

    class dcons{
        //private String name;xxxxx
        boolean attendance;
        dcons(String nam,boolean att){
            name=nam;
            attendance=att;
        }
    }
*/
//use another way to access private variable


public class abstraction {
    public static void main(String[] args) {
        dcons o1 = new dcons("balamurugan", false);
    }
}

class dcons {
    private String name;
    private boolean attendance;

    dcons(String nam, boolean att) {
        name = nam;
        attendance = att;

        System.out.println(name);
        System.out.println(attendance);
    }
}

