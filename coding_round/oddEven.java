public class oddEven {
    public static void main(String[] args) {
        int array[]=new int[10];
        int even=0;
        int odd=0;
        for (int i = 0; i < 10; i++) {
            array[i]=i;
        }
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]%2==0){
                even++;
            
            }
            else{
                odd++;
            }
       
            
        }
        System.out.println(even);
        System.out.println(odd);
        


    }
}
