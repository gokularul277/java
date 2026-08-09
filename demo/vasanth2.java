

public class vasanth2 {
    public static void main(String[] args) {
       int mark=97;

       if(mark>=90 && mark<=100){
        System.out.println("grade A");
    }
        else if(mark>=60 && mark<90){
            System.out.println("grade B");
        }
        else if(mark>=40 && mark<60){
            System.out.println("grade C");
        }
        else if(mark<40 && mark>=0){
            System.out.println("fail");
        }
        else{
            System.out.println("invalid");
        }
        
    } 
}
