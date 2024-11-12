public class linkedlist {
    Node head;

    linkedlist() {
        head = null;
    }

    public void add(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}

