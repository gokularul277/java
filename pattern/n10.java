public class n10 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int k = 1; k <=n; k++) {
                if(i<=k){
                    System.out.print("*");
                }
                if(i>k){
                    System.out.print("0");
                }
                
            }
            System.out.println();
            
        }
    }
}
