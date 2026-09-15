public class passingarray {
    public static void main(String[] args) {
        int a[]={9,8};
        for (int o:v(a)) {
            System.out.println(o);
            
        }
        
    }
    static int[] v(int []a){
        int []g=new int[2];
        int k=0;
        for (int i : a) {
            g[0+k]=i;
            k++;
            
        }
        return g;

    }
}
