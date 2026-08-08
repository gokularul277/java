public class methodover_ridding {
    public static void main(String[] args) {
        sonn o1=new sonn();
        o1.dia();
        
    }
}
// feild overridding
/*class father{
    int age=56;

}
class sonn extends father{
    double age=7.7;
}*/
class father{
    void dia(){
        System.out.println("rishiiii");
    }

}
class sonn extends father{
      void dia(){
    System.out.println("potta");
}
}