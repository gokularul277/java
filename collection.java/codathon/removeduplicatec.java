public class removeduplicatec {
    public static void main(String[] args) {
        String a="gokulmbhjgdfufhkcdnbdbcv";
        String b="";
        String c="";
        for (int i = 0; i < a.length(); i++) {
            if(b.indexOf(a.charAt(i))==-1){
                b=b+a.charAt(i);
            }
            else{
                c=c+a.charAt(i);
            }
            
        }
        System.out.println(b);
        System.out.println(c);
    
    for (int i = 0; i < b.length(); i++) {
        System.out.println(b.charAt(i)+":"+count(b.charAt(i),a));
        


        
    }

}
  static int count(char a1,String a){
    int count=0;
    for (int i = 0; i <a.length(); i++) {
        if(a.charAt(i)==a1){
            count++;
        }
        
    }
    return count;
  }
}
