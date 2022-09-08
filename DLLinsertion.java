import java.util.*;

class DLLinsertion
{
    class Node{
        int data;
        Node previous;
        Node next;
        public Node(int data) {
            this.data = data;
        }
    }
    Node head=null;
    Node tail = null;
    public void AddStart(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            return;
        }

        else {

            head.previous = newNode;

            newNode.next = head;

            newNode.previous = null;

            head = newNode;
        }
    }

    //print() will print the nodes of the list
    public void print() {

        Node curr = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Append a node to the start of the list: ");
        while(curr != null) {

            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        DLLinsertion dList = new DLLinsertion();


        dList.AddStart(5);
        dList.print();

        dList.AddStart(4);
        dList.print();

        dList.AddStart(3);
        dList.print();

        dList.AddStart(2);
        dList.print();

        dList.AddStart(1);
        dList.print();
    }
}