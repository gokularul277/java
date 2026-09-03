public class vowelconcount {
    public static void main(String[] args) {
        int vowelconcount=0;
        int consonantcount=0;
        String j="gokul";
        for (int i = 0; i < j.length(); i++) {
            if(j.charAt(i)=='a'||j.charAt(i)=='e'||j.charAt(i)=='i'||j.charAt(i)=='o'||j.charAt(i)=='u'){
                vowelconcount++;

            }
            else{
                consonantcount++;

            }
            
            
        }
        System.out.println(vowelconcount);
        System.out.println(consonantcount);


    
    }
}
