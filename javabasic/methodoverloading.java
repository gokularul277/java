public class methodoverloading {
    public static void main(String[] args) {
        polymorphism o1=new polymorphism();
        o1.display();
        o1.display(2);
        
    }
}


class polymorphism{
    void display(){
        System.out.println("display");

    }
    void display(int a){
        System.out.println(a);
    }
}
