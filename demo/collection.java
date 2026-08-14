import java.util.Stack;
public class collection {
    public static void main(String[] args) {
        Stack <Integer> stk=new Stack<>();
        stk.push(7);
        stk.push(8);
        stk.add(9);
        System.out.println(stk.peek());
        //System.out.println(stk.pop());
        System.out.println(stk);
    }
}
