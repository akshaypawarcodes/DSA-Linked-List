import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(4);
        s.push(6);
        s.push(5);
        s.push(1);
        s.add(2);

        s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }

    }
}
