import java.util.Stack;

public class RemoveMiddleOfStack {

    //using recursion
    static void deleteMiddle(Stack<Character> st, int n, int count){
        //BASE CASE
        if(st.empty()||count == n){
            return;
        }
        //Recursive call
        char x=st.pop();
        deleteMiddle(st, n, count+1);

        if(count!=n/2){
            st.push(x);
        }
    }

    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();
        st.push('4');
        st.push('5');
        st.push('2');
        st.push('1');
        st.push('7');

        System.out.println("orignal stack- "+st);

        deleteMiddle(st,st.size(),0);
        System.out.println("stack after delete middle");

        while(!st.isEmpty()){
            char x=st.pop();
            System.out.print(x+" ");
        }

    }
}
