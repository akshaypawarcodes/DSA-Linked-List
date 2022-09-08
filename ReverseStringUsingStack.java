import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str="java stack";
        Stack<Character> stack=new Stack<>();

        for(int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }

        System.out.println("the reverse of string is");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");

        }
    }

}
