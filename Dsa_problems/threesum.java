public class threesum {
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int target=24;
        Two(a, target);}

    static void Two(int[] a,int target){
        for (int i = 0; i <a.length; i++) {
            for (int j = i+1; j<a.length; j++) {
                for (int k = j+1; k <a.length; k++) {
                    if(a[i]+a[j]+a[k]==target){
                        System.out.println(i+  "  "+j+ "  "+k);
                    }
                    
                }
                
            }
        }
    }
}

