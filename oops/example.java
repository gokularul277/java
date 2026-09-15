public class example {
    public static void main(String[] args) {
        guitar a=new guitar();
        piano b=new piano();
        a.play();
        b.play();
        
    }
    
}
interface playable{
    void play();

}
class guitar implements playable{
    public void play(){
        System.out.println("football");
    }

}
class piano implements playable{
    public void play(){
        System.out.println("volly ball");
    }

}