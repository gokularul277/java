public class finalkey {
    public static void main(String[] args) {
    final  int a=10;
    B o=new B();
    o.dia();
    
    }
}
final class A{   // if FINAL is used can not be inherit
    final void dia(){
        System.out.println("jiii");
    }
}

//class B extends A{
   // void dia(){      ////ERROR OCCURE
       // System.out.println("cooooo");
   // }
//}
