public class super1 {
    public static void main(String[] args) {
        cat c1=new cat("gokul");
        
    }
}
class  dog{
    dog(){
        System.out.println("oii");
    }
}

class cat extends dog{
    cat(String f) {
        //super("gokul");
        System.out.println(f+"mewww");
    }
    
}
