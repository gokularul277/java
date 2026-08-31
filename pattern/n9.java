public class n9 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int k =n; k >=1; k--) {
                if(k<=i){
                    System.out.print("*");
                }
                if(k>i){
                    System.out.print("0");
                }

                
            }
                System.out.println();
            }
            
            
        }
    }

