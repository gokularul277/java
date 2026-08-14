public class linearsearch {
    public static void main(String[] args) {
        int a[]={56,98,67,8,45};
        int target=45;
        System.out.println(index(a, target));
    }



        static int index(int a[],int target){
            for (int i = 0; i < a.length-1; i++) {
                if(target==a[i])
                    return i;
            
            }
            return -1;
    
}
}
