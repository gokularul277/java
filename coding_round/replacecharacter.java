public class replacecharacter {
    public static void main(String[] args) {
        String a="gokulkalaiyilsappadusappittan";
        char []k=a.toCharArray();
        rd(k);

        



    }
    static void rd(char[] k ){
        for (int i = 0; i < k.length; i++) {
            boolean c=true;
            int h=1;
            for (int j = 0; j <i; j++) {
                if(k[i]==k[j]){
                    h++;
                    c=false;
                    break;

                }

                
            }
            if(h<2){
                System.out.print(k[i]);
            }
        }
    }
}
