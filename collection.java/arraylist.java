import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        ArrayList<Integer> f=new ArrayList<Integer>();
        f.add(5);
        f.add(10);
        f.add(15);
        f.add(20);
        System.out.println(f);
        //System.out.println(f.get(0));
        //System.out.println(f.size());
        System.out.println(f.remove(0));
        System.out.println(f);
        f.set(0,1);
        System.out.println(f);
        f.add(1,2);
        System.out.println(f);
        ArrayList<Integer> nnn=(ArrayList<Integer>) f.clone();
        System.out.println(nnn);
        //nnn.clear();
        System.out.println(nnn);

        f.addAll(nnn);
        System.out.println(f);
        Integer[] arr = f.toArray(new Integer[f.size()]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        

        
    }
}
