class sample{
    int a;
    String name;
        sample() {// uses of initialization
            a=89;
            name="gokul";
            System.out.println("Constructor");
    }
    
}

public class constructors {
    public static void main(String[] args) {
        sample obj1=new sample();
        System.out.println(obj1.name);        
    }
}
