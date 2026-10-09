public class binarySearch {
    public static void main(String[] args) {
        int a[]={67,90,78,54,3477};
        int key=3477;
        int ri=a.length-1;
        int left=0;
        while (true) { 
            int mid=(left+ri)/2;
            if(a[mid]==key){
                System.out.println(mid);
                break;
            }
            else if(key>a[mid]){
                left=mid+1;
            }
            else{
                ri=mid-1;
            }


            
        }
    }
}
