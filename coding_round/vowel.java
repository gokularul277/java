public class vowel {
    public static void main(String[] args) {
        String a="hokularul";
        char u=a.charAt(0);
        char f=Character.toLowerCase(u);
        if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("consonant");
        }

    }
}
