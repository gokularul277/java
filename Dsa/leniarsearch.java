public class leniarsearch {
    public static void main(String[] args) {
        int a[]={67,90,78,54,34,8,77};
        int key=8;
        for (int i = 0; i <a.length; i++) {
            if(key==a[i]){
                System.out.println(i);
                break;
            }
            
        }
    }
}
