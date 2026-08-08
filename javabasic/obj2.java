public class obj2 {
    public  static void main(String[] args) {
        gokul o1=new gokul();
        o1.add(78,35);
        gokul o3= new gokul();
        o3.add(23,32);
        gokul o2= new gokul();
        o2.add(89,0);
        o2.add(3,5);

        
    }
}


class gokul{
    public void add(int a, int b){
        System.out.println(a+b);
    }
}
