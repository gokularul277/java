public class sinhle_level {
    public static void main(String[] args) {
        son1 ob=new son1();
        ob.print();
    }
}



class  father{
    int age=56;
    void print(){
        System.out.println("parent");
    }
}

class son1 extends father{
    int roll=67000;
    void print(){
        System.out.println("so232222n");
    }
}