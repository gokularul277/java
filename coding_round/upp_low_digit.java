public class upp_low_digit {
    public static void main(String[] args) {
        char a='r';
        if(a>='A'&&a<='z'){
            System.out.println("UPPR");
        }
        else if(a>='a'&& a<='z'){
            System.out.println("LOWWR");
        }
        else if(a>='0'&& a<='9'){
            System.out.println("digit");
        }
        else{
            System.out.println("Invalid");
        }
        }
    }

