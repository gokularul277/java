public class countfrequencyofele {
    public static void main(String[] args) {
        int []a={32,76,98,98,76,33,11,11};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]+"    "+fre(a[i],a));

            
        }

    }

    static int fre(int a,int []s){
        int count=0;
        for (int i = 0; i < s.length; i++) {
            if(a==s[i]){
                count++;
            }

            
        }return count;
    }
}
