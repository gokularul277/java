public class oddeven_array_printing {
    public static void main(String[] args) {
        int[] a={98,56,8,5};
        for (int i = 0; i <a.length; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]+"  is : even");
            }
            else{
                 System.out.println(a[i]+"  is : odd");
            }
            
        }
    }
}
