public class factorial {
    public static void main(String[] args) {
        int num=12;
        int i=0;
        long fac=1;
        while(num!=1){
            fac=fac*num;
            num--;

        }
        System.out.println(fac);
    }
}
