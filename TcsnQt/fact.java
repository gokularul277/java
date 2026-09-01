public class fact {
    public static void main(String[] args) {
        System.out.println(factu(5));
        
    }
    static int factu(int a){
        if(a<0){
            return '\0';
             

        }
        else if (a==0) {
            return 1;
            
        }
        return a*factu(a-1);
        
       
    }
    
}
