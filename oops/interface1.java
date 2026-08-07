public class interface1 {
    public static void main(String[] args) {
        father oe=new father();
        oe.usa();
        oe.when();
    }
}




interface wa{
    abstract void usa();
    abstract void when();

}

class father implements wa{
    public void usa(){
        System.out.println("drink");

    }
    public void when(){
        System.out.println("thagam");
    }
}

