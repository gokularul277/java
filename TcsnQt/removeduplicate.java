public class removeduplicate {
    public static void main(String[] args) {
        String n="banana jakkil jaggu";
        char a[]=n.toCharArray();
        String rev="";
        for (char i : a) {
            if(rev.indexOf(i)==-1){
                rev=rev+i;
            }
            
        }
        System.out.println(rev);
        String h="io";
        System.out.println(h.indexOf('y'));
    }
}
