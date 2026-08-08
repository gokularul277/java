public class astractmethod {
    public static void main(String[] args) {
        op o1=new op();
        o1.add(4,8);
        o1.mul(4,0);
    }
}
// abstract method must be overridden
//abstract class must be inheritance


abstract class ab{
    abstract void add(int a,int b);
    abstract void mul(float a,float b);
        
    }
class op extends ab{
    public void add(int a, int b){
        System.out.println(a+b);}
    public void mul(float a,float b){
        System.out.println(a*b);
    }
    }

