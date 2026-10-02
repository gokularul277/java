public class bubblesortyc {
    public static void main(String[] args) {
        int arr[]={9,7,6};
        int g[]=bub(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(g[i]);
            
        }
        
    }

    static int[] bub(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    
                }
                
            }
            
        }
        return arr;
    }
}
