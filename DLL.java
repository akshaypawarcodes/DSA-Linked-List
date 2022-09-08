public class DLL {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;
    public void Addfirst(int data){
        Node newNode=new Node(data);
        if(head == null){
            head =newNode;
            return;
        }else {
            newNode.next=head;
            head.prev=newNode;
            newNode.prev=null;
            head=newNode;
        }
        System.out.println("head "+ head.data);
    }
    public void Addlast(int data){
        Node newNode=new Node(data);
        if(tail == null) {
            head = newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        newNode.next=null;
        tail=newNode;

    }

   public void printelement() {
        Node currNode = head;
        if(head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        while(currNode != null)
        {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

    }

    public static void main(String[] args) {
        DLL list=new DLL();
        list.Addfirst(4);
//
        list.Addfirst(3);

        list.Addfirst(2);

        list.Addfirst(1);

        list.Addfirst(0);
        list.printelement();

        list.Addlast(5);
        list.printelement();

        list.Addlast(6);
        list.printelement();

        list.Addlast(7);
        list.printelement();
    }
}
