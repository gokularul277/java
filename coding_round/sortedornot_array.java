public class sortedornot_array {
    public static void main(String[] args) {
        int a[]={67,98,101};
        System.out.println(sortedarr(a));
        
    }


    static boolean sortedarr(int[]a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                return false;
            }
            
        }
        return true;
}
}
