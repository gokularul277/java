public class equality_oftwo_arry {
    public static void main(String[] args) {
        int a[]={5,7,9};
        int b[]={5,7,9};
       // boolean result=Arrays.equals(a, b);
        //System.out.println(result);

        boolean n=true;
        int l1=a.length;
        int l2=b.length;
        if(l1==l2){
            for (int i = 0; i < a.length; i++) {
                if(a[i]==b[i]){
                    n=true;
                }
                else{
                    n=false;
                }
            }
            if(n==true){
                System.out.println("same");

            }
            else{
                System.out.println("not same");
            }}

        else{
            System.out.println("not same");
        }
                
            }
        }

   

