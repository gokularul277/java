public class multiple_inheritance {
    public static void main(String[] args) {
        gokul u=new gokul();
        u.co();
        u.col();
    }
}

interface su{
    abstract void co();

    }
interface ar{
    abstract void col();
    }


class gokul implements su,ar{
    public void co(){
        System.out.println("black");}
    public void col() {
        System.out.println("white");
    }
    }
