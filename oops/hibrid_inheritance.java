public class hibrid_inheritance {
    public static void main(String[] args) {
        mother o1=new mother();
        o1.addi();
        uncle o2=new uncle();
        o2.addi();
        cousin o3=new cousin();
        o3.addi();
        o3.boo();
        o3.game();
    }
}

class grand_father{
    public void addi(){
        System.out.println("jiiiii");
    }

}
class mother extends grand_father{
    void GOO(){
        System.out.println("hiiii");

    }

}

class uncle extends grand_father{
    public void boo(){
        System.out.println("biiiii");
    }

}
class cousin extends uncle{
    public void game(){
        System.out.println("cricket");
    }
}

