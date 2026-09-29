
import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(50);
        System.out.println(ll);
        ll.add(1,11);
        System.out.println(ll);
        
        System.out.println(ll.get(1));
        ll.set(4,40);
        System.out.println(ll);
        ll.add(20);
        System.out.println(ll);
        System.out.println(ll.lastIndexOf(20));
        System.out.println(ll.contains(11));
        System.out.println(ll.size());
        ll.remove(2);
        System.out.println(ll);
        LinkedList<Integer> cc=new LinkedList<>();
        cc.add(100);
        cc.add(200);
        cc.add(300);
        cc.add(500);
        ll.addAll(0,cc);
        System.out.println(ll);
        LinkedList <Integer> tt=(LinkedList<Integer>)ll.clone();
        System.out.println(tt);


        

    }
}
