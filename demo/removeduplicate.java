public class removeduplicate {
    public static void main(String[] args) {
        String p="gokulhvgdfrt";
        String h="";
        String d="";
        
        for (int i = 0; i < p.length(); i++) {
            if(h.indexOf(p.charAt(i))==-1){
                h+=p.charAt(i);
            }
            else{
                d+=p.charAt(i);

            }
            
        }
        System.out.println(h);
        System.out.println(d);




        for (int i = 0; i < d.length(); i++) {
            System.out.println(d.charAt(i)+" "+fre(d.charAt(i),p));
            
        }
    static int fre(String d,,String p){
        int c=0;
        for (int i = 0; i < p.length(); i++) {
            if(h.charAt(o)==p.charAt(i)){
                c++;
            }


            

            
        }
        return c;
    }
}