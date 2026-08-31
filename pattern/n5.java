public class n5 {
    public static void main(String[] args) {
        int c=1;
        for (int i = 1; i <=5; i++) {
            c=i%2==0 ? 0:1;
            
            for (int j = 1; j <=i; j++) {
                if(c==0){
                System.out.print(c);
                c++;}
                else{
                    System.out.print(c);
                    c--;
                }
                
            }
            System.out.println();
            
        }
    }
}
/*public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

            System.out.println();
        }
    }
} */
