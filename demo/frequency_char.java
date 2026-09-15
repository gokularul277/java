
public class frequency_char {
    public static void main(String[] args) {
        
        String a="gokulguyh";
        String b="";
        for (int i = 0; i < a.length(); i++) {
            if(b.indexOf(a.charAt(i))==-1){
                b+=a.charAt(i);
            }
            
        }//g-2  o-1
    

        for(int i=0;i<b.length();i++){
            System.out.println(b.charAt(i)+"  :"+freq(b.charAt(i), a));
        }
    }
    static int freq(char h,String a1){
        int c=0;
        for (int i = 0; i < a1.length(); i++) {
            if(h==a1.charAt(i)){
                c++;
            }

            
        }
        return c;

    }
}
