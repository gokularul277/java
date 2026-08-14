public class largest_ele {
    public static void main(String[] args) {
        int array[]=new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=i;

            
        }
        int max =array[0];
        for (int i = 0; i <=array.length-1; i++) {
            if(max>array[i]){
                max=array[i];
            }
            
        }
        System.out.println(max);
    }
}
