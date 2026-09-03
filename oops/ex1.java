public class ex1 {
    public static void main(String[] args) {
        person_reciver p1=new person_reciver("gokul",67,89,"chennai");
        p1.gokul();
        
    }

}

class person {
    person(String name,int age,int Socialsecuritynumber,String address){
        this.age=age;
        this.name=name;
        this.Socialsecuritynumber=Socialsecuritynumber;
        this.address=address;

    }
    public String name;
    protected int age;
    public int Socialsecuritynumber;
    public String address;
    


}
class person_reciver extends person{

    public person_reciver(String name,int age,int Socialsecuritynumber,String address) {
        super(name,age,Socialsecuritynumber,address);
    }
    void gokul(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(Socialsecuritynumber);
        System.out.println(address);
    }


    
    
}
