public class obj3 {
    public static void main(String[] args) {
        applform o1=new applform();
        //o1.j="hiiii";  //not accesible because private
        o1.set("gokul");
        String j1=o1.display();
        System.out.println(j1);
    }
}


class applform{
    private String j ;
    public String display(){
       // System.out.println(j);
        return j;
    }
    public void set(String g){
        j=g;
    }

}
