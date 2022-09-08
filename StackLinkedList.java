public class StackLinkedList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
         static class stack{
       static Node head = null;

       //push elelment
             public void push(int data){
                 Node newNode=new Node(data);
                 if(head == null){
                     head=newNode;
                     return;
                 }
                 newNode.next=head;
                 head=newNode;
             }

             public static boolean isEmpty(){
                 return head == null;
             }

       //pop element
             public int pop(){
                 if(isEmpty()){
                     return -1;
                 }
                 Node top=head;
                 head=head.next;
                 return top.data;
             }

             public int peek(){
                 if(isEmpty()){
                     return -1;
                 }
                 Node top=head;
                 return top.data;
             }
    }
    public static void main(String[] args) {
        stack s=new stack();
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}