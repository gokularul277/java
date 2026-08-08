public class hirarchical {
    public static void main(String[] args) {
        bro1 o1=new bro1();
        o1.print4();
        sis1 o2=new sis1();
        o2.print4();
        


        
    }
}


class mom3{
    void print4(){
        System.out.println("magan or magal");
    }

}


class bro1 extends mom3{
    

}

class sis1 extends mom3{

}