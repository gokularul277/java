public class Bubblesort {
    public static void main(String[] args) {
        int [] a={65,87,98,89,45,11};
        

        for (int i = 0; i <a.length-1; i++) {
            for (int j = 0; j < a.length-1-i; j++) {
                if(a[j]>a[j+1]){
                    int t=a[j+1];
                    a[j+1]=a[j];
                    a[j]=t;
                }
                
            }
            
        }
        for (int h = 0; h <a.length; h++) {
            System.out.println(a[h]);
            
        }
    }
}
