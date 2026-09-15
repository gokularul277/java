public class pal2 {
    public static void main(String[] args) {
        String h="goghgfgydytiuhvghg";
        String h1;

        for (int i = 0; i <h.length(); i++) {
            if(non(i,h)){
                System.out.print(h.charAt(i));
                
            }

            
        }
    }
    static boolean non(int i,String h){
            for (int j = 0; j < i; j++) {
                if(h.charAt(j)==h.charAt(i)){
                    return true;
                }
                
            }
            return false;
            
        }
    }
