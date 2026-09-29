import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class dynamicarray {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>(2);
        a.add(1);
        a.add(7);
        a.add(4);
        a.add(1,78);
        int h=a.get(1);
        System.out.println(h);
        System.out.println(a.size());
        a.set(0,0);
        a.set(1,1);
        //a.remove(0);
        //a.remove(1);
        //a.remove(1);
       // a.clear();
        Collections.sort(a,Collections.reverseOrder());
        Iterator i=a.iterator();

        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        //System.out.println(a.size());

        
    }
}
