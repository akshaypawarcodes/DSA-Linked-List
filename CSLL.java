public class CSLL {

    public class Node {
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    Node head=null;
    Node tail=null;

    //add at starting
    public void AddAtfirst(int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head == null){
            head=newNode;
            tail=newNode;
        }else {
            newNode.next=temp;
            head=newNode;
            tail.next=head;
        }
    }

    //add at end
    public void AddAtlast(int data){
        Node newNode =new Node(data);
        Node currNode =head;
        if(tail == null){
            head =newNode;
            tail =newNode;
        }else{
            while(currNode.next!=head){
                currNode=currNode.next;
            }
            currNode.next=newNode;
            newNode.next=head;
            newNode=tail;
        }
    }

    //add at middle
    public void AddAtposition(int position, int data){
        Node newNode=new Node(data);
        Node currNode=head;
        int cnt=1;
        if(head == null){
            head=newNode;
            tail=newNode;
            return;
        }
            while(cnt!=position-1){
                currNode=currNode.next;
                cnt++;
            }
            newNode.next=currNode.next;
            currNode.next=newNode;

    }

    //delete at first position
    public void deleteAtfirst(){
        if (head == null) {
           return;
        }else {
            //check if list have only one node
            if(head == tail){
                head=tail=null;
            }else{
                head=head.next;
                tail.next=head;
            }
        }

    }

    //delete node at selected position
    public void deleteAtposition(int position){
        int cnt=1;
        Node currNode=head;
        if(position == 1){
            deleteAtfirst();
        }
        while(cnt!=position-1){
            currNode=currNode.next;
            cnt++;
        }
        currNode.next=currNode.next.next;
    }

    //print the output
    public void printData(){
        Node currNode=head;
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        do{
            System.out.print(" "+ currNode.data);
            currNode=currNode.next;
        }
        while(currNode!=head);{
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CSLL list=new CSLL();

        System.out.println("list after add node at head");
        list.AddAtfirst(5);
        list.AddAtfirst(4);
        list.AddAtfirst(3);
        list.AddAtfirst(2);
        list.AddAtfirst(1);
        list.printData();

        System.out.println("list after delete first node");
        list.deleteAtfirst();
        list.printData();

        System.out.println("list after add node at last");
        list.AddAtlast(6);
        list.AddAtlast(7);
        list.printData();

        System.out.println("list after add node at selected position");
        list.AddAtposition(4,0);
        list.printData();

        System.out.println("list after delete node at selected position");
        list.deleteAtposition(4);
        list.printData(); 
    }
}
