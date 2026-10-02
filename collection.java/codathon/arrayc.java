public class arrayc {
    public static void main(String[] args) {
        int[]a={7,8};
        int[]b={7,8,9};
        System.out.println(sameornot(a, b));
    }
    static boolean sameornot(int[]a,int[]b){
        if(!(a.length==b.length)){
            
            return false;
            
        }
        else{
            for (int i = 0; i <a.length; i++) {
                if(a[i]!=b[i]){
                    return false;
                    

                }
                
            }
            return true;
        }
    }
}

