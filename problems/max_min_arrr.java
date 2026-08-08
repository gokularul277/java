public class max_min_arrr {
    public static void main(String[] args) {
        int f[]={67,90,7,86,54};
        int min=f[0];

        for (int i = 0; i < f.length; i++) {
            if(min<f[i]){
                min=f[i];
            }

            
        }
        System.out.println(min);
    }
}
