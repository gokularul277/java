public class leanersearch {
    public static void main(String[] args) {
        int[] g={1,3,0,2,5};
        int target =3;
        System.out.println(leanersearch(target, g));



    }
    static int leanersearch(int target,int[]g){
        for (int i = 0; i < g.length; i++) {
            if(g[i]==target){
                return i;
            }

            
        }
        return -1;
    }
}

