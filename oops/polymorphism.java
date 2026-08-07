public class polymorphism {
    public static void main(String[] args) {
        poly obj2=new poly();
        obj2.display();
        System.out.println(obj2.display(9,9));
       
        
    }
}

/*class poly{
    int display(){
        return 9;
    }
    void display(){
        System.out.println("i am a gokul");

    }
    
}*/
/*class poly{
    void  display(int a, int j){
        System.out.println(a+j);
    }
    void display(){
        System.out.println("i am a gokul");

    }
    
}*/
class poly{
    int display(int a,int b){
       return a+b;
    }
    void display(){
        System.out.println("i am a gokul");

    }
    
}
