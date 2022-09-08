public class deldll {
    static class Node{
        public int data;
        public Node prev;
        public Node next;
         Node(int data) {
            this.data = data;
        }
    }

    Node head=null;
    Node tail = null;


    //add at last
    public void addNodeAtlast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        }
        else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }
    //add at start
    public void Addfirstposition(int data){
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

    //insert at any position
    public void insertAtposition( int position, int data){
        Node nodetoinsert=new Node(data);
        Node temp=head;
        int cnt =1;
        if(temp.next == null){
            addNodeAtlast(data);
            return;
        }
        if(position == 1){
            Addfirstposition(data);
            return;
        }

        while(cnt!=position-1){
            temp=temp.next;
            cnt++;
        }
        nodetoinsert.next=temp.next;
        temp.next.prev=nodetoinsert;
        temp.next=nodetoinsert;
        nodetoinsert.prev=temp;
    }

    //delete first node
    public void deleteInitialNode() {
        if(head == null) {
            System.out.println("Doubly Linked List is empty");

        }
        else {
            if(head!= tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }

    //delete last node
    public void deleteAtlast(){
        if(head == tail){
            head=tail=null;
            return;
        }
            tail.prev.next=null;
            tail=tail.prev;
            tail.prev=null;
    }
    //delete middle node
    public void deleteMiddle(){
        if(head == null){
            head =null;
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next.prev=slow.prev;
        slow.prev.next=slow.next;
    }

    //delete at selected position
    public void deleteAtposition(int position){

        Node temp=head;
        int cnt=1;
        if(temp.next == null){
            head=null;
            return;
        }
        if(position == 1){
            deleteInitialNode();
            return;
        }
        while(cnt!=position){
            temp=temp.next;
            cnt++;
        }
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }

    void printNode() {
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
        System.out.println();
    }
    public static void main(String[] args) {
        deldll doublyLL = new deldll();
        System.out.println("Doubly linked list: ");

        doublyLL.addNodeAtlast(3);
        doublyLL.addNodeAtlast(5);
        doublyLL.addNodeAtlast(7);
        doublyLL.addNodeAtlast(9);
        doublyLL.addNodeAtlast(11);
        doublyLL.printNode();

        doublyLL.Addfirstposition(2);
        doublyLL.Addfirstposition(1);
        doublyLL.printNode();

        System.out.println("Doubly Linked List after deleting at the beginning: ");
        doublyLL.deleteInitialNode();
        doublyLL.printNode();

        System.out.println("list after deleting at the last");
        doublyLL.deleteAtlast();
        doublyLL.printNode();

        System.out.println("list after deleting at the middle");
        doublyLL.deleteMiddle();
        doublyLL.printNode();

        System.out.println("list after adding at the selected position");
        doublyLL.insertAtposition( 3, 0);
        doublyLL.printNode();

        System.out.println("list after delete at selected position");
        doublyLL.deleteAtposition(4);
        doublyLL.printNode();
    }
}