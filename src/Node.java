public class Node {
    Node next;
    int data;
    public Node(int data){
        this.data = data;
    }


}

public class LinkedList{
    Node head;

    public void append(int data){
        if(head==null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
}