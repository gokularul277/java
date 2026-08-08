public class obj4 {
    public static void main(String[] args) {
        sample s1=new sample(500,28);
        System.out.println(s1.mark);
        System.out.println(s1.rollno);
        
    }
}

class sample{
    int rollno;
    int mark;
    sample(int a,int b){
        rollno=a;
        mark=b;
}}
