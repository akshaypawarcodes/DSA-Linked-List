public class AddElementInLinkedList {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data= data;
            this.next= null;
        }
    }
    //add at first
    public void AddFirstElement(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add at last
    public void addLast(String data){
        Node newNode =new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node cn=head;
        while(cn.next!=null){
            cn=cn.next;
        }
        cn.next=newNode;
    }


    //print our data
    public void printlist(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node cn=head;
        while(cn!=null){
            System.out.print(cn.data+" ");
            cn=cn.next;
        }
        System.out.print("NULL");
    }

    //delete first
    public void deletefirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
    }

    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node secondLastNode =head;

        while(secondLastNode.next.next!=null){
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;
    }

    public static void main(String[] args) {
        AddElementInLinkedList l=new AddElementInLinkedList();

        l.AddFirstElement("a");
        l.AddFirstElement("is");
        l.AddFirstElement("this");

        l.addLast("list");

        //l.deletefirst();

        l.deletelast();

        l.printlist();


    }
}
