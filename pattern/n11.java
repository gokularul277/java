public class n11 {
    public static void main(String[] args) {
        int n=5;
        for (int l = 1; l <=n*2-1; l++) {
            for (int i = 1; i <=n*2-1; i++) {
                if(i>n-l && i<n+l){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
}
