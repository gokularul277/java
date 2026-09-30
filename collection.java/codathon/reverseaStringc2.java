public class reverseaStringc2 {
    public static void main(String[] args) {
        String a="golog";
        if(rev(a)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    static boolean rev(String a){
        for(int i=0,j=a.length()-1;i<j;i++,j--){
            if(a.charAt(i)!=a.charAt(j)){
                return false;
                

            }
           
            
        

        }
        return true;
        
    }
}

