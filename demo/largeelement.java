public class largeelement {
    public static void main(String[] args) {
        int []o={78,98,45,78,435};
        o[se_largest(o)]=Integer.MIN_VALUE;
        System.out.println(o[se_largest(o)]);


    }

    static int se_largest(int[]o){
        int max=o[0];
        int c=0;
        for (int i = 0; i <o.length; i++) {
            if(max<o[i]){
                max=o[i];
                c=i;

            }
            
        }
        return c;
        

    }
}
