public class firstnonrepeatingcharacter {
    public static void main(String[] args) {
        
    
    String a="gokulamarankadai";
    char a1[]=a.toCharArray();
    int i=0;
    while (true) { 
        if(fir(a1,a1[i],i)){
            System.out.println(a1[i]);
            break;
        }
        i++;
    }

    }

    static boolean fir(char[]a1,char p,int k){
        for (int i = k+1; i < a1.length; i++) {
            if(p==a1[i]){
                return false;
            }

            
        }
        return true;
    }
}

