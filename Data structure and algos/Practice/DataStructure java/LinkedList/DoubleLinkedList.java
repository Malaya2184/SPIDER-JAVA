class Node{

    int data;
    Node prev;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    @Override
    public String toString() {
        return "Node [data=" + data + "]";
    }
    
}

class DLinkedList{
    Node head;
    Node tail;
    Node mid;
    DLinkedList(){
        this.head = null;
        this.tail= null;
        this.mid = null;
    }

    void insertNode(int data){
        Node newNode = new Node(data);
        int size = 0;
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            this.mid= newNode;
            size+=1;
        }
        else{
            Node current = this.tail;
            newNode.prev = current;
            current.next= newNode;
            this.tail = current.next;
        }
    }
    void printDll(){
        Node current = this.head;
        while (current.next !=null) {
            System.out.print(current.data+"--->");
            current = current.next;

        }
        System.out.println(current.data+"---->null");
    }
}


public class DoubleLinkedList {
    public static void main(String[] args) {
        DLinkedList d = new DLinkedList();
        d.insertNode(5);
        d.insertNode(6);
        d.insertNode(7);
        d.printDll();
        // System.out.println(d.tail.prev.next.prev.prev.next.next.data);
    }
    
}
