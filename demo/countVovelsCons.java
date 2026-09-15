public class countVovelsCons {
    public static void main(String[] args) {
        int vowel=0;
        int cons=0;
        String na="gokul nalla payan ";
        na=na.toUpperCase();

        char[]name=na.toCharArray();
        for (int i = 0; i < name.length; i++) {
            if(name[i]=='A'||name[i]=='E'||name[i]=='I'||name[i]=='O'||name[i]=='U'){
                vowel++;
            }
            else{
                cons++;
            }
            
        }
        System.out.println(vowel);
        System.out.println(cons);
    }
}
